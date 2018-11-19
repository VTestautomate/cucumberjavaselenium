package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PersonalDetailsPage {
	WebDriver driver;
	public PersonalDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	By accountCreationMessage = By.xpath(".//*[@class='info-message']");
	By houseNumber = By.cssSelector("div#root input[name=\"houseName\"]");
	By firstName = By.cssSelector("div#root input[name=\"firstName\"]");
	By lastName = By.cssSelector("div#root input[name=\"lastName\"]");
	By phoneNumber = By.cssSelector("div#root input[name=\"mobile\"]");
	By userTitle = By.cssSelector("div#root input[name=\"title\"]");
	By postCode = By.cssSelector("div#root input[name=\"postcode\"]");
	By lookupAddressButton = By.cssSelector("div#root button[testid=\"addressLookupButton\"]");
	By lookUpAddressScreen = By.cssSelector("div#root h1[class=\"title\"]");
	By addressSaveButton = By.cssSelector("div#root button[testid=\"saveButton\"]");
	By nextButton = By.cssSelector("div#root button[testid=\"submitButton\"]");
	By qualificationAndTraining = By.xpath("h5");
	

	public void selectTitle(String title) {
		WebElement mySelectElement = driver.findElement(userTitle);
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText(title);
	}
	
	public void selectAddress(String addressLine) {
		driver.findElement(By.xpath("//div[contains(text(), addressLine)]")).click();
	}
	
	public WebElement qualificationAndTraining() {
		return driver.findElement(qualificationAndTraining);
	}
	
	public WebElement addressSaveButton() {
		return driver.findElement(addressSaveButton);
	}
	
	public WebElement nextButton() {
		return driver.findElement(nextButton);
	}
	
	public WebElement lookUpAddressScreen() {
		return driver.findElement(lookUpAddressScreen);
	}
	
	public WebElement postCode() {
		return driver.findElement(postCode);
	}
	
	public WebElement lookupAddressButton() {
		return driver.findElement(lookupAddressButton);
	}
	
	
	public void waitForPageLoaded(WebDriver driver) {
		ExpectedCondition<Boolean> expectation = driver1 -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete");
		Wait<WebDriver> wait = new WebDriverWait(driver, 20);
		wait.until(expectation);
		}
	
	public void waitForElementToBeClickable(WebDriver driver, By locator) {
		Wait<WebDriver> wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
	
	public WebElement accountCreationMessage() {
		return driver.findElement(accountCreationMessage);
	}
	
	public WebElement houseNumber() {
		return driver.findElement(houseNumber);
	}
	
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement phoneNumber() {
		return driver.findElement(phoneNumber);
	}
	
}