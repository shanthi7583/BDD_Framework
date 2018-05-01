$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test\\resources\\com\\salesforce\\login\\login.feature");
formatter.feature({
  "line": 1,
  "name": "Logging into Salesforce",
  "description": "\r\nIn Order to work\r\nAs a sales person\r\ni want to login",
  "id": "logging-into-salesforce",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Logging in Salesforce",
  "description": "",
  "id": "logging-into-salesforce;logging-in-salesforce",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I go to \"loginURL\" on \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter \"loginusername\" as \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"loginpassword\" as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on \"loginbutton\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "login should be \"\u003cExpected_Result\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "logging-into-salesforce;logging-in-salesforce;",
  "rows": [
    {
      "cells": [
        "Browser",
        "username",
        "password",
        "Expected_Result"
      ],
      "line": 15,
      "id": "logging-into-salesforce;logging-in-salesforce;;1"
    },
    {
      "cells": [
        "Chrome",
        "nikil.kaarthi@gmail.com",
        "7@oracle",
        "success"
      ],
      "line": 16,
      "id": "logging-into-salesforce;logging-in-salesforce;;2"
    },
    {
      "cells": [
        "mozilla",
        "nikil.kaarthi@gmail.com",
        "7@oracle",
        "success"
      ],
      "line": 17,
      "id": "logging-into-salesforce;logging-in-salesforce;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Logging in Salesforce",
  "description": "",
  "id": "logging-into-salesforce;logging-in-salesforce;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I go to \"loginURL\" on \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter \"loginusername\" as \"nikil.kaarthi@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"loginpassword\" as \"7@oracle\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on \"loginbutton\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "login should be \"success\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 17,
  "name": "Logging in Salesforce",
  "description": "",
  "id": "logging-into-salesforce;logging-in-salesforce;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I go to \"loginURL\" on \"mozilla\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter \"loginusername\" as \"nikil.kaarthi@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"loginpassword\" as \"7@oracle\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on \"loginbutton\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "login should be \"success\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});