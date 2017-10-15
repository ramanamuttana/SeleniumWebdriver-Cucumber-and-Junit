package selenium_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberClass {
	WebDriver driver;
	
	
	@Given("^I want to write a step with precondition$")
	public void I_want_to_write_a_step_with_precondition() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\Geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver(); 
	
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		driver.get("https://www.udacity.com/course/viewer#!/c-cs046/l-205740632/e-205774547/m-205774548");
	
		
	  
	}

	@When("^I complete action$")
	public void I_complete_action() throws Throwable {
	
	 
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
	  
		System.out.println(outcome().isDisplayed());
	}

	@Then("^I validate the outcomes$")
	public void I_validate_the_outcomes() throws Throwable {
	
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	  
	}
   public WebElement outcome()
   {
	   driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=googlemail&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement element2=driver.findElement(By.xpath(".//*[@id='identifierId']"));
	return element2;
	
    }


}
