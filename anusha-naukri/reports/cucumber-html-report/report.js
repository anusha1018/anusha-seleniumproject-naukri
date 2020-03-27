$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/anunaukri.feature");
formatter.feature({
  "line": 2,
  "name": "naukri website",
  "description": "",
  "id": "naukri-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@naukri_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "check that the user can login naukri account",
  "description": "",
  "id": "naukri-website;check-that-the-user-can-login-naukri-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks login",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 10055260400,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_opens_naukri_homepage()"
});
formatter.result({
  "duration": 16324562200,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_clicks_login()"
});
formatter.result({
  "duration": 9019302100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "check that the user can click more and move to any field",
  "description": "",
  "id": "naukri-website;check-that-the-user-can-click-more-and-move-to-any-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_more"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user can launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user opens the naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user can click more and move to any field",
  "keyword": "And "
});
formatter.match({
  "location": "more_step.user_can_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 9483861600,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_opens_the_naukri_homepage()"
});
formatter.result({
  "duration": 13948691400,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_clicks_login_button()"
});
formatter.result({
  "duration": 530000700,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_can_click_more_and_move_to_any_field()"
});
formatter.result({
  "duration": 13619769400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "check that the user is able to follow hr",
  "description": "",
  "id": "naukri-website;check-that-the-user-is-able-to-follow-hr",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tc03_HR"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user launchs the chrome browser to follow hr",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user opens the naukri homepage for hr",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user logins to naukri page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user applys filter",
  "keyword": "Then "
});
formatter.match({
  "location": "hr_step.user_launchs_the_chrome_browser_to_follow_hr()"
});
formatter.result({
  "duration": 9449269000,
  "status": "passed"
});
formatter.match({
  "location": "hr_step.user_opens_the_naukri_homepage_for_hr()"
});
formatter.result({
  "duration": 20841778000,
  "status": "passed"
});
formatter.match({
  "location": "hr_step.user_logins_to_naukri_page()"
});
formatter.result({
  "duration": 5923668900,
  "status": "passed"
});
formatter.match({
  "location": "hr_step.user_applys_filter()"
});
formatter.result({
  "duration": 48343949000,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "check that the user can search for recruiters",
  "description": "",
  "id": "naukri-website;check-that-the-user-can-search-for-recruiters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tc04_search_recruiters"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user launched the chrome browser for search_recruiters scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user launches naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user login the naukri page",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "the user can go to recruiters",
  "keyword": "Then "
});
formatter.match({
  "location": "recruiter_step.user_launched_the_chrome_browser_for_search_recruiters_scenario()"
});
formatter.result({
  "duration": 9451680200,
  "status": "passed"
});
formatter.match({
  "location": "recruiter_step.user_launches_naukri_homepage()"
});
formatter.result({
  "duration": 16758650200,
  "status": "passed"
});
formatter.match({
  "location": "recruiter_step.user_login_the_naukri_page()"
});
formatter.result({
  "duration": 2946398400,
  "status": "passed"
});
formatter.match({
  "location": "recruiter_step.the_user_can_go_to_recruiters()"
});
formatter.result({
  "duration": 8627668200,
  "status": "passed"
});
});