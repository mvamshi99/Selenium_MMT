package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import objectrepository.NaukriObjects;
import utilities.CommonUtilities;
import utilities.SeleniumUtils;

public class Zomato {
	public WebDriver driver;
	public SeleniumUtils seleniumUtil;
	public CommonUtilities commonUtil;
	public NaukriObjects nobj;
	
	public Zomato() {
		seleniumUtil = new SeleniumUtils();
		seleniumUtil.launchBrowser("Chrome"); 
		driver = SeleniumUtils.getDriver();
		commonUtil = new CommonUtilities(); 
	}

	
	@Given("^Enter \\\"(.*)\\\" website$")
	public void enter_website(String URL) {
	    driver.get(URL);
	}

	@Then("^Click on the \\\"(.*)\\\" button$")
	public void click_on_the_button(String btnName) {
		By log = By.xpath("//li/a[text()='"+btnName+"']");
		commonUtil.Click(log);
	}

	@Then("^Enter username as \\\"(.*)\\\"$")
	public void enter_username_as(String userName) {
		WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(nobj.zomatoPh));
		wait.sendKeys("8074307046");
//		WebElement search2=driver.findElement(By.xpath("//span[text()=\"Send OTP\"]"));
//		search2.click();
	}

	@Then("Click on the login button.")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
