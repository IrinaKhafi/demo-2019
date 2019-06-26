$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darksky.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@darksky"
    }
  ]
});
formatter.before({
  "duration": 5661531490,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify invalid signup error message",
  "description": "",
  "id": "login-feature;verify-invalid-signup-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@darksky-1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the darksky Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I verify error message \"please fill out this field\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iAmOnRegisterPage()"
});
formatter.result({
  "duration": 1850860928,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.clickOnRegisterButton()"
});
formatter.result({
  "duration": 124783632,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyErrorMessage()"
});
formatter.result({
  "duration": 17956207,
  "status": "passed"
});
formatter.after({
  "duration": 207494242,
  "status": "passed"
});
formatter.before({
  "duration": 3452063218,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline",
  "description": "",
  "id": "login-feature;verify-current-temperature-should-not-be-greater-or-less-than-the-temperature-from-daily-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@darksky-2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I verify current temperature is not greater or less then temps from daily timeline",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iAmOnHomePage()"
});
formatter.result({
  "duration": 349528080,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.checkTemperature()"
});
formatter.result({
  "duration": 399113566,
  "status": "passed"
});
formatter.after({
  "duration": 169438150,
  "status": "passed"
});
formatter.before({
  "duration": 3311939813,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "login-feature;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@darksky-3"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I expand todays timeline",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I verify lowest and highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iAmOnHomePage()"
});
formatter.result({
  "duration": 351774263,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.expandTimeline()"
});
formatter.result({
  "duration": 448225517,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.compareWeather()"
});
formatter.result({
  "duration": 183378478,
  "status": "passed"
});
formatter.after({
  "duration": 160904742,
  "status": "passed"
});
formatter.before({
  "duration": 3259702701,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Verify timline is displayed in correct format",
  "description": "",
  "id": "login-feature;verify-timline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@darksky-4"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iAmOnHomePage()"
});
formatter.result({
  "duration": 292535133,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.checkTimeIncrementation()"
});
formatter.result({
  "duration": 120582191,
  "status": "passed"
});
formatter.after({
  "duration": 326889268,
  "status": "passed"
});
});