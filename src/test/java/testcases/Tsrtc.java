package testcases;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import objectrepository.NaukriObjects;
import utilities.CommonUtilities;
import utilities.SeleniumUtils;

public class Tsrtc {
	public WebDriver driver;
	public SeleniumUtils seleniumUtil;
	public CommonUtilities commonUtil;
	
	public Tsrtc() {
		seleniumUtil = new SeleniumUtils();
		seleniumUtil.launchBrowser("Chrome"); 
		driver = SeleniumUtils.getDriver();
		commonUtil = new CommonUtilities();
	}
	
	
	@Given("Go to Tsrtc website")
	public void go_to_Tsrtc_website() {
	    driver.get("https://www.tsrtconline.in/");
	}

	@Then("^Click on \\\"(.*)\\\"$")
	public void click_on(String string) {
		driver.findElement(NaukriObjects.etkog).click();   
	}


	@Then("enter {string} and {string}")
	public void enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
