

@sanity @regression
Feature: Home Page Test
 As a user I want to verify the job search result using different data sets
 
 Scenario Outline: : user should verify the job search result using different data provided
 Given I am on homepage
 When  I accept cookies
 And   I enter job title "<JobTitle>"
 And   I enter Location "<Location>"
 And   I select  distance "<Distance>"
 And   I click on moreSearchOptionsLink
 And   I enter salaryMin "<SalaryMin>"
 And   I enter salaryMax "<SalaryMax>"
  And  I select salaryType "<Salary Type>"
 And   I select jobType "<JobType>"
 And   I click on 'Find Jobs' button
 Then  I verify the result "<VerifyMessage>"

  Examples:
 |  JobTitle         | Location              | Distance  | SalaryMin  |SalaryMax   | Salary Type  |  JobType  | VerifyMessage                                 |
 |Document Controller|Harrow, Greater London |   15 miles|  30000     |  40000     |  Per annum   |Permanent  |Permanent Document Controller jobs in Harrow   |
 |Teacher            |Harrow, Greater London |   15 miles|  25000     |  40000     |  Per annum   |Permanent  |Permanent Teacher jobs in Harrow               |
 |Tester             |Watford, Hertfordshire |   10 miles|  40000     |  45000     |  Per annum   |Permanent  |Permanent Tester jobs in Watford               |
 | Accountant        | Harrow,Greater london | 10 miles  | 30000      | 500000     | Per annum    | Permanent | Permanent Accountant jobs in Harrow           |
 | Manager           | Watford, Hertfordshire| 15 miles  | 20000      | 300000     | Per annum    | Permanent | Permanent Manager jobs in Watford             |
 | Test Engineer     | Luton                 | 10 miles  | 30000      | 600000     | Per annum    | Permanent | Permanent Test Engineer jobs in Luton         |









