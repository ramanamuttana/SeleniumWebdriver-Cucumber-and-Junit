package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"cucumberselenium1"},format={"html:Cucumber/cucumber-html-report","json:Cucumber/cucumber-json-report"})

public class TestRunner1 {

}
