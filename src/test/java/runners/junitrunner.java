package runners;

import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "steps", "hooks" }, plugin = { "pretty",
		"html:target/cucumber-reports/cucumber-html-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class junitrunner { // ,tags= "@login"

}
