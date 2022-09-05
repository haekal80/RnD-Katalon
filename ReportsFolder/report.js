$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test clock in",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "User is navigated to homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "@dminKAI123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test clock in",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter admin and @dminKAI123",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.navigatedToHomepage()"
});
formatter.result({
  "status": "passed"
});
});