package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feature"}, 
		glue = {"Stepdefinition"}, 
		monochrome = true, 
		dryRun = false
		)
public class Testrunner {
 
}
