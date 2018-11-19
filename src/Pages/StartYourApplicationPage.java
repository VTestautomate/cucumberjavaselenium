package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class StartYourApplicationPage {
	WebDriver driver;

	public StartYourApplicationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	By email=By.xpath(".//*[@id='email']");
	By password=By.xpath(".//*[@id='password']");
	By passwordConfirmation=By.xpath(".//*[@id='passwordConfirmation']");
	By rightToWork=By.xpath(".//*[@id='rightToWork']/parent::*");
	By hasExperience=By.xpath(".//*[@id='hasExperience']/parent::*");
	By hasConsent=By.xpath(".//*[@id='consentDataStored']/parent::*");
	By agreeTermsConditions=By.xpath(".//*[@id='agreeTermsConditions']/following-sibling::span[@class='checked']");
	By agreePrivacyPolicy=By.xpath(".//*[@id='agreePrivacyPolicy']/following-sibling::span[@class='checked']");
	By registerButton=By.xpath(".//*[@class='form-group']/button");
	By passwordError = By.xpath(".//*[@class='form-error']/span");
	

	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement passwordConfirmation() {
		return driver.findElement(passwordConfirmation);
	}
	
	public WebElement rightToWork() {
		return driver.findElement(rightToWork);
	}
	
	public WebElement hasExperience() {
		return driver.findElement(hasExperience);
	}
	
	public WebElement hasConsent() {
		return driver.findElement(hasConsent);
	}
	
	public WebElement agreeTermsConditions() {
		return driver.findElement(agreeTermsConditions);
	}
	
	public WebElement agreePrivacyPolicy() {
		return driver.findElement(agreePrivacyPolicy);
	}
	
	public WebElement registerButton() {
		return driver.findElement(registerButton);
	}
	
	public WebElement passwordError() {
		return driver.findElement(passwordError);
	}
}

