package testcases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.CommonUtilities;
import utilities.SeleniumUtils;

public class Guru99Web {
	public WebDriver driver;
	public SeleniumUtils seleniumUtil;
	public CommonUtilities commonUtil;
	
	public Guru99Web() {
		seleniumUtil=new SeleniumUtils();
		seleniumUtil.launchBrowser("Chrome"); 
		driver=SeleniumUtils.getDriver();
		commonUtil=new CommonUtilities();
	}
	@Given("Launch Browser and open Guru99 Website")
	public void launch_Browser_and_open_Guru99_Website() {
	    driver.get("https://www.guru99.com/");
	  
	}
	  
	

	@Then("click over AI dropdown and capture values under it")
	public void click_over_AI_dropdown_and_capture_values_under_it() {
		  driver.findElement(By.xpath("//span[@class=\"nav-drop-title-wrap\"and text()=\"AI\"]")).click();
			List<WebElement> allText = driver.findElements(By.xpath("//ul[@class=\"sub-menu show\"]//a"));
			for ( WebElement element: allText) { 
			    System.out.println(element.getText());
//			    List<String> allText=new Arraylist<String>();
			}
  
}
}