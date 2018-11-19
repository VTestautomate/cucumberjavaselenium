package Utils;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class DriverSetup {
	
	
	public WebDriver setupDriver() throws Throwable {	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/Users/vinnu/Downloads/chromedriver");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--ignore-certificate-errors");
	options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	driver = new ChromeDriver(options);
	
	return driver;
	
	}
}
