package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy()
    WebElement resultText ;

    public void verifyTheResult(String excepted){

        log.info("Verify the result :" + resultText.toString());
        String actualText = getTextFromElement(resultText);
        String expectedText = excepted;
        Assert.assertEquals(actualText,expectedText,"Verify Results Title ");
    }
}
