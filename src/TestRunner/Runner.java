package TestRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
		plugin = {
				 "pretty", 
				 "html:reports/"
			     },
		features = "Features",
		glue = {"StepDefinition"},
		monochrome = true
		)

public class Runner{		

}
