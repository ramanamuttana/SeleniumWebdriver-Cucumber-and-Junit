package selenium_cucumber;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;

public class Smoketest1 {
	WebDriver driver;

	@Given("^I am on the gcrshop$")
	public void I_am_on_the_gcrshop() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\Geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		// driver.get("http://www.gcrit.com/build3/login.php");
		driver.get("http://www.gcrit.com/build3/");
		Thread.sleep(3000);
	}

	@When("^ishould click on new registration$")
	public void ishould_click_on_new_registration() throws Throwable {
		System.out.println("creating an account");
		driver.findElement(By.linkText("create an account")).click();
		Thread.sleep(2000);

	}

	@When("^i fill the details \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_fill_the_details_and(DataTable table) throws Throwable {

		/*
		 * List<List<String>> data=table.raw();
		 * System.out.println(data.get(0).get(0).toString());
		 * System.out.println(data.get(0).get(1).toString());
		 */
		List<UserDetails> users = new ArrayList<UserDetails>();
		users = table.asList(UserDetails.class);
		for (UserDetails userss : users) {
			System.out.println("the Firstname" + userss.firstname);
			System.out.println("the Firstname" + userss.lastname);
			driver.findElement(By.cssSelector(".fieldValue>input")).click();
			driver.findElement(By.name("firstname")).sendKeys(userss.firstname);
			// driver.findElement(By.name("firstname")).sendKeys("Ramana");
			driver.findElement(By.name("lastname")).sendKeys(userss.lastname);
			driver.findElement(By.id("dob")).sendKeys("02/26/1992");
			driver.findElement(By.name("email_address")).sendKeys("ramanadasdssaa@gmail.com");
			driver.findElement(By.name("street_address")).sendKeys("Gogulapadu,Guntur");
			driver.findElement(By.name("postcode")).sendKeys("523415");
			driver.findElement(By.name("city")).sendKeys("guntur");
			driver.findElement(By.name("state")).sendKeys("Andhrapradesh");
			Select Dropdown = new Select(driver
					.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")));
			Dropdown.selectByVisibleText("India");
			driver.findElement(By.name("telephone")).sendKeys("1764342");
			driver.findElement(By.name("password")).sendKeys("venkata123");
			driver.findElement(By.name("confirmation")).sendKeys("venkata123");
			Thread.sleep(2000);
			driver.findElement(By.id("tdb4")).click();
			String ConformationMessage = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
			if (ConformationMessage.equals("Your Account Has Been Created!")) {
				System.out.println("Registration Successful");
			} else {
				System.out.println("Registration Unsucessful");
			}
			Thread.sleep(2000);
			// driver.findElement(By.xpath("//form[@class='ui-button-text']/input")).click();
			driver.close();
		}
	}

	class UserDetails {
		public String firstname;
		public String lastname;

		public UserDetails(String FirstName, String LastName) {
			this.firstname = FirstName;
			this.lastname = LastName;
		}
	}

	@When("^i fill the details$")
	public void i_fill_the_details() throws Throwable {
		System.out.println("creating an account");

	}

	@Then("^I submit my details$")
	public void I_submit_my_details() throws Throwable {
		System.out.println("creating an account");

	}

	@Then("^i should be on loginpage$")
	public void i_should_be_on_loginpage() throws Throwable {
		System.out.println("creating an account");

	}

}
