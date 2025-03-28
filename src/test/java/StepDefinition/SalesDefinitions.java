package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesDefinitions {

	public ChromeDriver driver;

	@Given("Launch the browser and Load URL")
	public void launch_the_browser_and_load_url() {
		ChromeOptions leaf = new ChromeOptions();
		leaf.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		leaf.addArguments("--disable-notifications");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		throw new io.cucumber.java.PendingException();
	}

	@When("Enter the UserName {string}")
	public void enter_the_user_name(String UserName) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(UserName);

		throw new io.cucumber.java.PendingException();
	}

	@When("Enter the Password {string}")
	public void enter_the_password(String Password) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Password);
		throw new io.cucumber.java.PendingException();
	}

	@When("Click LoginButton")
	public void click_login_button() {
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		throw new io.cucumber.java.PendingException();
	}

	/*
	 * @When("Verify Login is successfull") public void
	 * verify_login_is_successfull() {
	 * 
	 * throw new io.cucumber.java.PendingException(); }
	 */

	@When("Click Applaunch")
	public void click_applaunch() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='App Launcher']")).click();
		throw new io.cucumber.java.PendingException();
	}

	@When("Click ViewAll")
	public void click_view_all() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='slds-button'])[2]")).click();
		throw new io.cucumber.java.PendingException();
	}

	@When("Search ServiceTerritories")
	public void Search_ServiceTerritories() throws InterruptedException {
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//p[text()='Service Territories']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		throw new io.cucumber.java.PendingException();
	}



}
