$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#Verify login button is enabled after launching web-page"
    }
  ],
  "line": 5,
  "name": "Verify login button is enabled by default",
  "description": "",
  "id": "login;verify-login-button-is-enabled-by-default",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I verify login button is enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I quit Webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.launchWebpage()"
});
formatter.result({
  "duration": 10900662715,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.isLoginEnabled()"
});
formatter.result({
  "duration": 28649031,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.quitPage()"
});
formatter.result({
  "duration": 145505383,
  "status": "passed"
});
});