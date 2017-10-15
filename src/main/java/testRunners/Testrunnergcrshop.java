package testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featuresfiles",glue={"stepdefinationsfile"},format={"html:Cucumber/cucumber-html-report"})
public class Testrunnergcrshop{

}
