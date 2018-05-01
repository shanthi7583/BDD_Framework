$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\salesforce\\login\\login.feature");
formatter.feature({
  "line": 1,
  "name": "Logging into Salesforce",
  "description": "\r\nIn Order to work\r\nAs a sales person\r\ni want to login",
  "id": "logging-into-salesforce",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 28,
  "name": "Logging in Salesforce",
  "description": "",
  "id": "logging-into-salesforce;logging-in-salesforce;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I go to \"loginURL\" on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I enter \"loginusername\" as \"shanthij\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"loginpassword\" as \"7@oracle\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on loginbutton",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on the caseXpath",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click on the newcase \"NewcaseXpath\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter the title",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on the caseXpathnow",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I click on the newcase \"Searchxpath\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter the searchtitle",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I click on \"searchbutton\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on \"Reportxpath\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select the file",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "loginURL",
      "offset": 9
    },
    {
      "val": "Chrome",
      "offset": 23
    }
  ],
  "location": "Login.I_go_to_on(String,String)"
});
formatter.result({
  "duration": 8071993380,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginusername",
      "offset": 9
    },
    {
      "val": "shanthij",
      "offset": 28
    }
  ],
  "location": "Login.I_enter_as(String,String)"
});
formatter.result({
  "duration": 148561800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginpassword",
      "offset": 9
    },
    {
      "val": "7@oracle",
      "offset": 28
    }
  ],
  "location": "Login.I_enter_as(String,String)"
});
formatter.result({
  "duration": 137253351,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_click_on_loginbutton()"
});
formatter.result({
  "duration": 5947012410,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_click_on_the_caseXpath()"
});
formatter.result({
  "duration": 146123746,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewcaseXpath",
      "offset": 24
    }
  ],
  "location": "Login.I_click_on_the_newcase(String)"
});
formatter.result({
  "duration": 158827630,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_enter_the_title()"
});
formatter.result({
  "duration": 838210440,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_click_on_save_button()"
});
formatter.result({
  "duration": 107339394,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_click_on_the_caseXpathnow()"
});
formatter.result({
  "duration": 69114414,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Searchxpath",
      "offset": 24
    }
  ],
  "location": "Login.I_click_on_the_newcase(String)"
});
formatter.result({
  "duration": 202524440,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_enter_the_searchtitle()"
});
formatter.result({
  "duration": 474977976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "searchbutton",
      "offset": 12
    }
  ],
  "location": "Login.I_click_on(String)"
});
formatter.result({
  "duration": 119838004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reportxpath",
      "offset": 12
    }
  ],
  "location": "Login.I_click_on(String)"
});
formatter.result({
  "duration": 654758503,
  "status": "passed"
});
formatter.match({
  "location": "Login.I_select_the_file()"
});
formatter.result({
  "duration": 17235304,
  "status": "passed"
});
});