$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Verify LoginPage",
  "description": "",
  "id": "verify-loginpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify User Logged In",
  "description": "",
  "id": "verify-loginpage;verify-user-logged-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user should enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should see Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage1Test.user_launch_the_Application()"
});
formatter.result({
  "duration": 27084552925,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage1Test.user_should_enter_the_username_and_password()"
});
formatter.result({
  "duration": 912372711,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage1Test.user_click_on_login_button()"
});
formatter.result({
  "duration": 147572798,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage1Test.user_should_see_Home_Page()"
});
formatter.result({
  "duration": 15058557,
  "status": "passed"
});
});