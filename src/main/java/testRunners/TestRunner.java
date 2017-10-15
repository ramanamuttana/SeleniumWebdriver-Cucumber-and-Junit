package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",glue={"src/main/java/cucumber"},format={"html:Cucumber/cucumber-html-report","json:Cucumber/cucumber-json-report"})

public class TestRunner 
{

}
