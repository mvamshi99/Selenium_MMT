package testcases;

import java.time.Duration;
import java.util.List;
import java.util.Set;

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

public class Loginm {
	public WebDriver driver;
	public SeleniumUtils seleniumUtil;
	public CommonUtilities commonUtil;


	public Loginm() {
		seleniumUtil=new SeleniumUtils();
		seleniumUtil.launchBrowser("Chrome");
		driver=SeleniumUtils.getDriver();
		commonUtil=new CommonUtilities();
	}
		

	

@Given("^Go to \\\"(.*)\\\" websites$")
public void go_to_websites( String URL) {
	driver.get(URL);
	WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NaukriObjects.fltrmr));
    wait.click();
   
}

@Then("^Click on \\\"(.*)\\\" button$")
public void click_on_button(String btnName) {
	
//	WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NaukriObjects.fltrmr));
//    wait.click();
    WebElement wait1= new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NaukriObjects.btnName(btnName)));
    wait1.click();
    List<WebElement> elements = driver.findElements(NaukriObjects.fltrmr1);
    if(elements.size() == 1) {
    	commonUtil.Click(NaukriObjects.fltrmr1);
    }
//    driver.findElement(nobj.pnenmbr);
//		commonUtil.Click(nobj.pnenmbr);
   
}

@Then("^Enter mobile number as \\\"(.*)\\\"$")
public void enter_mobile_number_as(String number) {
commonUtil.Click(NaukriObjects.numbr);
commonUtil.enterText(NaukriObjects.numbr, "8074307046");



    
}

@Then("^Click on the CONTINUE button$")
public void click_on_the_CONTINUE_button() {
	commonUtil.Click(NaukriObjects.contne);
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}}



