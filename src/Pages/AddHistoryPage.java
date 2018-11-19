package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddHistoryPage {
	WebDriver driver;
	public AddHistoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	By addHistoryButton = By.cssSelector("div#root button[testid=\"addExperienceButton\"]");
	
	
	public WebElement addHistoryButton() {
		return driver.findElement(addHistoryButton);
	}
	
}