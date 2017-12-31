package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

// @RunWith is Junit test
//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Feature"},format = {"json:target/pcworldUK.json","html:target/site/pcworlduk-pretty"},glue = "Steps")
public class TestRun extends AbstractTestNGCucumberTests{

}
