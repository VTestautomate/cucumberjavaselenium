Feature: User Sign up flow 

@error
Scenario: Incorrect Sign Up details
	Given I am on the registration portal			
	When I Enter the incorrect registration details		
	Then I should see the error message for incorrect signup details

	
@success
Scenario: Navigate to History Page filling correct details
	Given I am on the registration portal			
	And I Enter the correct registration details		
	Then I should be on the personal details page
	And I fill all the personal details with "Mrs" as title
	When I fill in postcode "W5 2ET"
	And I click Lookup Address
	When I select the first line of address as "Flat 3 - Beverley Place"
	And I click on Save on the address list menu
	Then I should be on the personal details page
	And I should have the next button
	When User click on next button
	Then User should be on the "Qualifications & Training" page
	When user clicks on "Add Qualification" button
	Then user should be able to enter qualification completion date
	When user clicks on the "Add" button
	And user click on qualification added Next button
	Then user should be on the History page
			
	
	