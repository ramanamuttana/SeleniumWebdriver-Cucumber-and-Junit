package testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featuresdata",glue={"com.stepfile"},format={"html:Cucumber/cucumber-html-report"})

public class Datadriven {

}
