$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Final.feature");
formatter.feature({
  "name": "To validate the login functionality of myntra application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with valid user id and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "To Launch Edge browser and maximize windows",
  "keyword": "Given "
});
formatter.match({
  "location": "positiveandnegative.to_Launch_Edge_browser_and_maximize_windows()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Launch Url browser of the ICICI bank application",
  "keyword": "When "
});
formatter.match({
  "location": "positiveandnegative.to_Launch_Url_browser_of_the_ICICI_bank_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To move to the login button",
  "keyword": "And "
});
formatter.match({
  "location": "positiveandnegative.to_move_to_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To clickthe personal",
  "keyword": "And "
});
formatter.match({
  "location": "positiveandnegative.to_clickthe_personal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid useridin in number field",
  "keyword": "And "
});
formatter.match({
  "location": "positiveandnegative.to_pass_valid_useridin_in_number_field(String)"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [To pass valid useridin in number field] is defined with 1 parameters at \u0027org.stepdefinition.positiveandnegative.to_pass_valid_useridin_in_number_field(String) in file:/D:/eclipse/eclipse-workspace/Worked/CucumberFullProject/target/test-classes/\u0027.\nHowever, the gherkin step has 0 arguments.\nStep text: To pass valid useridin in number field\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the login",
  "keyword": "And "
});
formatter.match({
  "location": "positiveandnegative.to_click_the_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To check whether navigate to the home or not",
  "keyword": "And "
});
formatter.match({
  "location": "positiveandnegative.to_check_whether_navigate_to_the_home_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "to close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "positiveandnegative.to_close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.step({
  "name": "user has to hit the icici bank url",
  "keyword": "When "
});
formatter.step({
  "name": "user has to move to the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user has to click the personal",
  "keyword": "And "
});
formatter.step({
  "name": "user has to pass valid userid\"\u003cuserid\u003e\" in number field",
  "keyword": "And "
});
formatter.step({
  "name": "user has to click the login",
  "keyword": "And "
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userid"
      ]
    },
    {
      "cells": [
        "bhavin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Bestprograme.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to hit the icici bank url",
  "keyword": "When "
});
formatter.match({
  "location": "Bestprograme.user_has_to_hit_the_icici_bank_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to move to the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Bestprograme.user_has_to_move_to_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the personal",
  "keyword": "And "
});
formatter.match({
  "location": "Bestprograme.user_has_to_click_the_personal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass valid userid\"bhavin\" in number field",
  "keyword": "And "
});
formatter.match({
  "location": "Bestprograme.user_has_to_pass_valid_userid_in_number_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login",
  "keyword": "And "
});
formatter.match({
  "location": "Bestprograme.user_has_to_click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Bestprograme.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});