$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotels.feature");
formatter.feature({
  "line": 2,
  "name": "Horel functionality",
  "description": "",
  "id": "horel-functionality",
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
      "name": "@hotel"
    }
  ]
});
formatter.before({
  "duration": 5420247903,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "List of all of hotel within 10 miles radius of airport or downtown",
  "description": "",
  "id": "horel-functionality;list-of-all-of-hotel-within-10-miles-radius-of-airport-or-downtown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@hotel-2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I verify system displays all hotels within 10 miles radius of airport",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I verify Hilton Hotel is within radius",
  "keyword": "And "
});
formatter.match({
  "location": "HotelSD.iAmOnLandingPage()"
});
formatter.result({
  "duration": 3022163454,
  "status": "passed"
});
formatter.match({
  "location": "HotelSD.verifyRadius()"
});
formatter.result({
  "duration": 28992802756,
  "status": "passed"
});
formatter.match({
  "location": "HotelSD.verifyHilton()"
});
formatter.result({
  "duration": 416534959,
  "status": "passed"
});
formatter.after({
  "duration": 369342500,
  "status": "passed"
});
});