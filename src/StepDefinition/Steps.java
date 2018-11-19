package StepDefinition;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;

import Utils.DriverSetup;
import Utils.UserInfo;

import Pages.StartYourApplicationPage;
import Pages.PersonalDetailsPage;
import Pages.AddHistoryPage;
import Pages.AddQualificationPage;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import cucumber.api.java.After;



public class Steps {				

	static WebDriver driver; 
	
	  @Before public void setUp() throws Throwable { 
		  DriverSetup dr = new DriverSetup();
  	   	  driver = dr.setupDriver(); 
	   } 
	
	  @After public void quit() throws Throwable { 
		 driver.quit();
	   } 
	  
    @Given("^I am on the registration portal$")					
    public void open_the_browser_and_launch_the_application() throws Throwable							
    {		
    		driver.get("http://test.oaf.healthforcego.com");				
    }		

    @When("^I Enter the incorrect registration details$")					
    public void enter_the_incorrect_registation_details() throws Throwable 							
    {		
    		StartYourApplicationPage Signup = new StartYourApplicationPage(driver);	
    		UserInfo ui = new UserInfo();
    		String emailAddress = ui.getUserEmail();
    		String password = ui.getUserPassword();
    		Thread.sleep(5000);
    		
    		Signup.email().sendKeys(emailAddress);
    		Signup.password().sendKeys(password);
    		Signup.passwordConfirmation().sendKeys("Test123456");
    		Thread.sleep(2000);
    		Signup.rightToWork().click();
    		Signup.hasExperience().click();
    		Signup.hasConsent().click();
    		Signup.agreeTermsConditions().click();
    		Signup.agreePrivacyPolicy().click();
    		Signup.registerButton().click();						
    }		

    @Then("^I should see the error message for incorrect signup details$")					
    public void verify_signup_error_message() throws Throwable 							
    {		
    		StartYourApplicationPage Signup = new StartYourApplicationPage(driver); 	
    		Thread.sleep(2000);
     	String errorMessage = (Signup.passwordError()).getText();
     	errorMessage.equals("Passwords do not match");
    	 }	
    
	@When("^I Enter the correct registration details$")
	public void enter_correct_signup_details() throws Throwable 							
    {		
    		StartYourApplicationPage Signup = new StartYourApplicationPage(driver); 	
    		Thread.sleep(2000);
    		UserInfo ui = new UserInfo();
    		String emailAddress = ui.getUserEmail();
    		String password = ui.getUserPassword();
    		Thread.sleep(5000);
    		
    		Signup.email().sendKeys(emailAddress);
    		Signup.password().sendKeys(password);
    		Signup.passwordConfirmation().sendKeys(password);
    		Signup.rightToWork().click();
    		Signup.hasExperience().click();
    		Signup.hasConsent().click();
    		Signup.agreeTermsConditions().click();
    		Signup.agreePrivacyPolicy().click();
    		Signup.registerButton().click();
    	 }	
				
	@Then("^I should be on the personal details page$")
	public void assert_user_on_personal_details_page() throws Throwable 
	{
		PersonalDetailsPage pr = new PersonalDetailsPage(driver);
		Thread.sleep(3000);
		pr.waitForPageLoaded(driver);
		String text = pr.accountCreationMessage().getText();
		text.equals("We've created your Newcross account. You can login at any time to continue with your application.");
	}
	
	@Then("^I fill all the personal details with \"([^\"]*)\" as title$")
	public void i_fill_all_the_personal_details_with_as_title(String title) throws Throwable {
		PersonalDetailsPage pr = new PersonalDetailsPage(driver);
		pr.waitForElementToBeClickable(driver, By.cssSelector("div#root input[name=\"firstName\"]"));
		UserInfo ui = new UserInfo();
		Thread.sleep(5000);
//		pr.selectTitle(title);
		pr.firstName().sendKeys(ui.getUserFirstName());
		Thread.sleep(5000);
		pr.lastName().sendKeys(ui.getUserLastName());
		Thread.sleep(2000);
		pr.phoneNumber().sendKeys("07525222001");	
		Thread.sleep(2000);
	}

	@When("^I fill in postcode \"([^\"]*)\"$")
	public void i_fill_in_postcode(String postcode) throws Throwable {
		PersonalDetailsPage pr = new PersonalDetailsPage(driver);
		Thread.sleep(2000);
		pr.postCode().sendKeys(postcode);
	}

	@When("^I click Lookup Address$")
	public void i_click_Lookup_Address() throws Throwable {
		PersonalDetailsPage pr = new PersonalDetailsPage(driver);
		Thread.sleep(2000);
		pr.lookupAddressButton().click();
		Thread.sleep(2000);
	}


	@When("^I select the first line of address as \"([^\"]*)\"$")
	public void i_select_the_first_line_of_address(String addressLine) throws Throwable {
		PersonalDetailsPage pr = new PersonalDetailsPage(driver);
		Thread.sleep(2000);
		String text = pr.lookUpAddressScreen().getText();
		text.equals("Lookup Address");
		Thread.sleep(20000);
		pr.selectAddress(addressLine);
		Thread.sleep(2000);
	}
	
	@When("^I click on Save on the address list menu$")
	public void i_click_on_Save_on_the_address_list_menu() throws Throwable {
		PersonalDetailsPage pr = new PersonalDetailsPage(driver);
		Thread.sleep(2000);
		pr.addressSaveButton().click();
	}

	@Then("^I should have the next button$")
	public void i_should_have_the_Save_button() throws Throwable {
		PersonalDetailsPage pr = new PersonalDetailsPage(driver);
		Thread.sleep(2000);
		pr.nextButton();
	}

	@When("^User click on next button$")
	public void user_click_on_next_button() throws Throwable {
		PersonalDetailsPage pr = new PersonalDetailsPage(driver);
		Thread.sleep(2000);
		pr.nextButton().click();
	}

	@Then("^User should be on the \"([^\"]*)\" page$")
	public void user_should_be_on_the_page(String pageName) throws Throwable {
		AddQualificationPage qualification = new AddQualificationPage(driver);
		Thread.sleep(2000);
		qualification.addQualificationButton();
		
	}
	
	@When("^user clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String buttonName) throws Throwable {
		AddQualificationPage qualification = new AddQualificationPage(driver);
		qualification.addQualificationButton().click();
	}

	@Then("^user should be able to enter qualification completion date$")
	public void user_should_be_able_to_enter_qualification_completion_date() throws Throwable {
		AddQualificationPage qualification = new AddQualificationPage(driver);
		qualification.qualificationDateMonth().sendKeys("12");
		qualification.qualificationDateYear().sendKeys("2016");
	}

	@When("^user clicks on the \"([^\"]*)\" button$")
	public void user_clicks_on_the_button(String arg1) throws Throwable {
		AddQualificationPage qualification = new AddQualificationPage(driver);
		qualification.qualificationEnteredAdd().click();		
	}
	
	@When("^user click on qualification added Next button$")
	public void user_click_on_button() throws Throwable {
		AddQualificationPage qualification = new AddQualificationPage(driver);
		Thread.sleep(2000);
		qualification.addQualificationNextButton().click();
	}

	@Then("^user should be on the History page$")
	public void user_should_be_on_the_History_page() throws Throwable {
		AddHistoryPage history = new AddHistoryPage(driver);
		Thread.sleep(2000);
		history.addHistoryButton();
	}
}