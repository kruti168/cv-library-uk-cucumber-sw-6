package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){

        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;


    @CacheLookup
    @FindBy(id= "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(id="location")
    WebElement LocationField;

    @CacheLookup
    @FindBy(id="distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionLink ;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryType;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobType;

    @CacheLookup
    @FindBy(id="hp-search-btn")
    WebElement findJobsBtn;




    public void acceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
        Reporter.log("Acceptcookies");
        log.info("Acceptcookies:"+acceptCookies.toString());
    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
        Reporter.log("Enter job title"+ jobTitleField.toString());
        log.info("Enter job title:" +jobTitleField.toString());
    }
    public void enterLocation(String Location) {
        sendTextToElement(LocationField, Location);
        Reporter.log("Enter Location" + LocationField.toString());
        log.info("Enter location:" +LocationField.toString());
    }
    public void selectDistance(String Distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, Distance);
        Reporter.log("Select distance" + distanceDropDown.toString());
        log.info("Select distance:" +distanceDropDown.toString());


    }
    public void moreSearchOptionLink(){

        clickOnElement(moreSearchOptionLink);
        Reporter.log("Clicking on more search option" + moreSearchOptionLink.toString());
        log.info("Clicking on more search option :" + moreSearchOptionLink.toString());
    }
    public void enterSalaryMin(String minSalary){

        Reporter.log("Enter minimum salary" + salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
        log.info("Enter minimum salary" + salaryMin.toString());
    }
    public void enterSalaryMax(String maxSalary){
        Reporter.log("Enter maximum salary" + salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
        log.info("Enter maximum salary" + salaryMax.toString());
    }
    public void selectSalaryType(String salary){

        Reporter.log("Select salary type" + salaryType.toString());
        selectByVisibleTextFromDropDown(salaryType,salary);
        log.info("Select salary type from dropdown " + salaryType.toString());
    }
    public void selectJobType(String job){

        Reporter.log("Select job from dropdown " + jobType.toString());
        selectByVisibleTextFromDropDown(jobType,job);
        log.info("Select job from dropdown " + jobType.toString());
    }
    public void findJobsButton() {
        clickOnElement(findJobsBtn);
        log.info("Clicking on:" +findJobsBtn.toString());

    }


}
