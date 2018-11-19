$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2301832420,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Incorrect Sign Up details",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;incorrect-sign-up-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the registration portal",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I Enter the incorrect registration details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see the error message for incorrect signup details",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 1658434214,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_the_incorrect_registation_details()"
});
formatter.result({
  "duration": 38857377724,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_signup_error_message()"
});
formatter.result({
  "duration": 2043056395,
  "status": "passed"
});
formatter.after({
  "duration": 133568661,
  "status": "passed"
});
formatter.before({
  "duration": 1895742328,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Navogate to History Page filling correct details",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;navogate-to-history-page-filling-correct-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on the registration portal",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Enter the correct registration details",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be on the personal details page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I fill all the personal details with \"Mrs\" as title",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I fill in postcode \"W5 2ET\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click Lookup Address",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select the first line of address as \"Flat 3 - Beverley Place\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click on Save on the address list menu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be on the personal details page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I should have the next button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on next button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User should be on the \"Qualifications \u0026 Training\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user clicks on \"Add Qualification\" button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user should be able to enter qualification completion date",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user clicks on the \"Add\" button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user click on qualification added Next button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user should be on the History page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 2135847081,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_correct_signup_details()"
});
formatter.result({
  "duration": 16508848359,
  "status": "passed"
});
formatter.match({
  "location": "Steps.assert_user_on_personal_details_page()"
});
formatter.result({
  "duration": 3071748102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mrs",
      "offset": 38
    }
  ],
  "location": "Steps.i_fill_all_the_personal_details_with_as_title(String)"
});
formatter.result({
  "duration": 14536532755,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "W5 2ET",
      "offset": 20
    }
  ],
  "location": "Steps.i_fill_in_postcode(String)"
});
formatter.result({
  "duration": 2099630519,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_Lookup_Address()"
});
formatter.result({
  "duration": 9309312001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flat 3 - Beverley Place",
      "offset": 39
    }
  ],
  "location": "Steps.i_select_the_first_line_of_address(String)"
});
formatter.result({
  "duration": 24163087309,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_Save_on_the_address_list_menu()"
});
formatter.result({
  "duration": 2123955802,
  "status": "passed"
});
formatter.match({
  "location": "Steps.assert_user_on_personal_details_page()"
});
formatter.result({
  "duration": 3034366564,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_have_the_Save_button()"
});
formatter.result({
  "duration": 2019742607,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_next_button()"
});
formatter.result({
  "duration": 2076658174,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Qualifications \u0026 Training",
      "offset": 23
    }
  ],
  "location": "Steps.user_should_be_on_the_page(String)"
});
formatter.result({
  "duration": 2020986677,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Qualification",
      "offset": 16
    }
  ],
  "location": "Steps.user_clicks_on_button(String)"
});
formatter.result({
  "duration": 92258702,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_be_able_to_enter_qualification_completion_date()"
});
formatter.result({
  "duration": 250177055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add",
      "offset": 20
    }
  ],
  "location": "Steps.user_clicks_on_the_button(String)"
});
formatter.result({
  "duration": 104629564,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_button()"
});
formatter.result({
  "duration": 2080875848,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_be_on_the_History_page()"
});
formatter.result({
  "duration": 2026236717,
  "status": "passed"
});
formatter.after({
  "duration": 133529320,
  "status": "passed"
});
});