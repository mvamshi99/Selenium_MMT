package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import objectrepository.FactsetObjects;
import objectrepository.NaukriObjects;
import utilities.CommonUtilities;
import utilities.SeleniumUtils;

public class FactsetWeb {
	public WebDriver driver;
	public SeleniumUtils seleniumUtil;
	public CommonUtilities commonUtil;
	
	public FactsetWeb() {
		seleniumUtil=new SeleniumUtils();
		seleniumUtil.launchBrowser("Chrome"); 
		driver=SeleniumUtils.getDriver();
		commonUtil=new CommonUtilities();
	}
	
	@Given("Launch Browser and open Factset website")
	public void launch_Browser_and_open_Factset_website() throws InterruptedException, IOException {
	   driver.get("https://www.factset.com/");
	   SeleniumUtils.TakesScreenshot();
	   driver.findElement(By.id("hs-eu-confirmation-button")).click();
	   
	}


	@Then("Hover over Services dropdown and capture values under it")
	public void hover_over_Services_dropdown_and_capture_values_under_it() throws InterruptedException {
		
//		String A=driver.getCurrentUrl();
	    Actions ac = new Actions(driver);
	   Action service =  ac.moveToElement(driver.findElement(By.xpath("//a[@data-name=\"Services\" and @data-level=\"L1\"]"))).build();
	   service.perform();
	   Thread.sleep(2000);
	   Action cl = ac.click(driver.findElement(By.xpath("//a[@data-name=\"Implementation\" and @data-level=\"L2\"]"))).build();
	   cl.perform();
//	   String B=driver.getCurrentUrl();
//	   if( A.equalsIgnoreCase(B)){
//		   System.out.println("Operation is not Performed");
//	   }
//	   else {
//		   System.out.println("Click option is performed");
//	   }
//	   driver.navigate().back();
//	   String C=driver.getCurrentUrl();
//	   if(B.equalsIgnoreCase(C)) {
//		   System.out.println("Back Operation not Performed");
//	   }
//	   else {
//		   System.out.println("Back Operation Performed");
//	   }
//	   SeleniumUtils.TakesScreenshot();
//	   driver.navigate().forward();
//	   SeleniumUtils.TakesScreenshot();
//	   String D=driver.getCurrentUrl();
//	   if(C.equalsIgnoreCase(D)) {
//		   System.out.println("Forward Ops not performed");
//	   }
//	   else {
//		   System.out.println("Forward ops performed");
//	   }
	   
	}
	

	@Then("Compare captured and actual dropdown values")
	public void compare_captured_and_actual_dropdown_values() {
		driver.findElement(By.xpath("//li[@class=\"hs-menu-item hs-menu-depth-1 active hs-item-has-children active-branch\"]"));
		
	}






 

}
