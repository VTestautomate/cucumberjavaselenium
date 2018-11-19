package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class AddQualificationPage {
	WebDriver driver;
	public AddQualificationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	By addQualificationButton = By.cssSelector("div#root button[testid=\"addQualificationButton\"]");
	By qualificationEnteredAdd = By.cssSelector("div#root button[testid=\"saveButton\"]");
	By addQualificationNextButton = By.cssSelector("form[testid=\"form\"] button[testid=\"submitButton\"]");
	By qualificationDateMonth = By.cssSelector("div#root input[name=\"month\"]");
	By qualificationDateYear = By.cssSelector("div#root input[name=\"year\"]");
	
	public WebElement addQualificationButton() {
		return driver.findElement(addQualificationButton);
	}
	
	public WebElement qualificationDateMonth( ) {
		return driver.findElement(qualificationDateMonth);
	}
	
	public WebElement qualificationDateYear( ) {
		return driver.findElement(qualificationDateYear);
	}
	
	public WebElement qualificationEnteredAdd() {
		return driver.findElement(qualificationEnteredAdd);
	}
	
	public WebElement addQualificationNextButton() {
		return driver.findElement(addQualificationNextButton);
	}
		
}