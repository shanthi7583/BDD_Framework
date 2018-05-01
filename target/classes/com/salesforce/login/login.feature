Feature: Logging into Salesforce

In Order to work
As a sales person
i want to login

@smoketest
Scenario Outline: Logging in Salesforce
Given I go to "loginURL" on "<Browser>"
And I enter "loginusername" as "<username>"
And I enter "loginpassword" as "<password>"
And I click on loginbutton
Then I click on the caseXpath
And I click on the newcase "NewcaseXpath"
Then I enter the title
And I click on save button
Then I click on the caseXpathnow
And I click on the newcase "Searchxpath"
Then I enter the searchtitle
And I click on "searchbutton"
And I click on "Reportxpath"
And I select the file
#And I send a Mail
#And I close the browser

Examples:
| Browser  | username| password | Expected_Result |
| Chrome  |  shanthij| 7@oracle |  success        |

