package selenium_cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class stepdefinations {
	WebDriver driver ;
	@Given("^I am on the gcrshop$")
	public void I_am_on_the_gcrshop() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\Geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.get("http://www.gcrit.com/build3/login.php");
		driver.get("http://www.gcrit.com/build3/");
		Thread.sleep(3000); 
	}

	@When("^ishould click on new registration$")
	public void ishould_click_on_new_registration() throws Throwable {
		System.out.println("Filling the details");
	}

	
	@When("^i fill the details and submit and am on loginpage$")
	public void i_fill_the_details_and_submit_and_am_on_loginpage() throws Throwable {
		System.out.println("Filling the details");
	    
	}

	@When("^i fill the details \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\" submit and am on loginpage$")
	public void i_fill_the_details_and_and_submit_and_am_on_loginpage(String FirstName, String LastName, String Email) throws Throwable 
	{
		driver.findElement(By.linkText("create an account")).click();
		Thread.sleep(2000); 
		driver.findElement(By.cssSelector(".fieldValue>input")).click();
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		//driver.findElement(By.name("firstname")).sendKeys("Ramana");
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.id("dob")).sendKeys("02/26/1992");
		driver.findElement(By.name("email_address")).sendKeys(Email);
		driver.findElement(By.name("street_address")).sendKeys("Gogulapadu,Guntur");
		driver.findElement(By.name("postcode")).sendKeys("523415");
		driver.findElement(By.name("city")).sendKeys("guntur");
		driver.findElement(By.name("state")).sendKeys("Andhrapradesh");
		Select  Dropdown =  new Select (driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")));
	    Dropdown.selectByVisibleText("India");
	    driver.findElement(By.name("telephone")).sendKeys("1764342");
	    driver.findElement(By.name("password")).sendKeys("venkata123");
	    driver.findElement(By.name("confirmation")).sendKeys("venkata123");
	    Thread.sleep(2000);   	
	    driver.findElement(By.id("tdb4")).click();
		 String ConformationMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
	     if(ConformationMessage.equals("Your Account Has Been Created!")) 
	 {
	    System.out.println("Registration Successful");
	 }
	    else
	 {
	    System.out.println("Registration Unsucessful");
	 }	
	    Thread.sleep(2000);	
	    driver.close();
	    //driver.findElement(By.xpath("//form[@class='ui-button-text']/input")).click();
	}
	

}
