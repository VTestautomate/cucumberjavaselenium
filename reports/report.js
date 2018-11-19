$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "User Sign up flow",
  "description": "",
  "id": "user-sign-up-flow",
  "keyword": "Feature"
});
formatter.before({
  "duration": 32978061238,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Incorrect Sign Up details",
  "description": "",
  "id": "user-sign-up-flow;incorrect-sign-up-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@error"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the registration portal",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Enter the incorrect registration details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see the error message for incorrect signup details",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 12203070935,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_the_incorrect_registation_details()"
});
formatter.result({
  "duration": 11926264624,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_signup_error_message()"
});
formatter.result({
  "duration": 2055654140,
  "status": "passed"
});
formatter.after({
  "duration": 587142116,
  "status": "passed"
});
formatter.before({
  "duration": 6322417724,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Navigate to History Page filling correct details",
  "description": "",
  "id": "user-sign-up-flow;navigate-to-history-page-filling-correct-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@success"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on the registration portal",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I Enter the correct registration details",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be on the personal details page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I fill all the personal details with \"Mrs\" as title",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I fill in postcode \"W5 2ET\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click Lookup Address",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select the first line of address as \"Flat 3 - Beverley Place\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click on Save on the address list menu",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should be on the personal details page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I should have the next button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on next button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User should be on the \"Qualifications \u0026 Training\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user clicks on \"Add Qualification\" button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user should be able to enter qualification completion date",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user clicks on the \"Add\" button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user click on qualification added Next button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user should be on the History page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 2903064204,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_correct_signup_details()"
});
formatter.result({
  "duration": 9261783069,
  "status": "passed"
});
formatter.match({
  "location": "Steps.assert_user_on_personal_details_page()"
});
formatter.result({
  "duration": 3386653167,
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
  "duration": 14903045460,
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
  "duration": 2160571573,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_Lookup_Address()"
});
formatter.result({
  "duration": 4105746223,
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
  "duration": 24203693385,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_Save_on_the_address_list_menu()"
});
formatter.result({
  "duration": 2311009859,
  "status": "passed"
});
formatter.match({
  "location": "Steps.assert_user_on_personal_details_page()"
});
formatter.result({
  "duration": 3060109658,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_have_the_Save_button()"
});
formatter.result({
  "duration": 2025513549,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_next_button()"
});
formatter.result({
  "duration": 2109218465,
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
  "duration": 2107890333,
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
  "duration": 345855478,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_be_able_to_enter_qualification_completion_date()"
});
formatter.result({
  "duration": 424964945,
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
  "duration": 294067446,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_button()"
});
formatter.result({
  "duration": 2110826441,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_be_on_the_History_page()"
});
formatter.result({
  "duration": 2055756758,
  "status": "passed"
});
formatter.after({
  "duration": 491457598,
  "status": "passed"
});
});