package selenium_cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Login {
	
	WebDriver driver;
	
	@Given("^Open Firefox and open the Facebook page$")
	public void Open_Firefox_and_open_the_Facebook_page1() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\Geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^I enter username and Password$")
	public void I_enter_username_and_Password1() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ramanamuttana@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("");
	}
	
	@Then("^I ahave to be on my home page$")
	public void I_ahave_to_be_on_my_home_page() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();  
	}
}
