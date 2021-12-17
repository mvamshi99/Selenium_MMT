package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import objectrepository.NaukriObjects;
import utilities.CommonUtilities;
import utilities.SeleniumUtils;

public class SelectFlight {
	public WebDriver driver;
	public SeleniumUtils seleniumUtil;
	public CommonUtilities commonUtil;
	
	public SelectFlight() {
		seleniumUtil=new SeleniumUtils();
//		seleniumUtil.launchBrowser("Chrome");
		driver=SeleniumUtils.getDriver();
		commonUtil=new CommonUtilities();
		
		 
	}
	@Then("Select {string} city for destination")
	public void select_city_for_destination(String string) throws InterruptedException {
		WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NaukriObjects.fltrmr));
	    wait.click();
	    commonUtil.Click(NaukriObjects.loginacc);
	    commonUtil.Click(NaukriObjects.from);
	    commonUtil.Click(NaukriObjects.fromin);
        commonUtil.enterText(NaukriObjects.fromin, "JAI");
        WebElement wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NaukriObjects.frmselt));
	    wait1.click();
	    Thread.sleep(2000);
	    commonUtil.enterText(NaukriObjects.to, "MUMBAI");
        commonUtil.Click(NaukriObjects.toselt);
        commonUtil.Click(NaukriObjects.seldate);
        commonUtil.Click(NaukriObjects.Search);
        commonUtil.Click(NaukriObjects.fltrmr1);

	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	



}
