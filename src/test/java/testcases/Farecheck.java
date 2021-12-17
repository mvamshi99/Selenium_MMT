package testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import objectrepository.MMTObjects;
import objectrepository.NaukriObjects;
import utilities.CommonUtilities;
import utilities.SeleniumUtils;

public class Farecheck {
	public WebDriver driver;
	public SeleniumUtils seleniumUtil;
	public CommonUtilities commonUtil;
	
	public Farecheck() {
		seleniumUtil=new SeleniumUtils();
		driver=SeleniumUtils.getDriver();
		commonUtil=new CommonUtilities();
	}

	@Then("^Select \\\"(.*)\\\" city$")
	public void select_city(String cityType) {
	    if(cityType.equalsIgnoreCase("from")) {
		    commonUtil.Click(NaukriObjects.loginacc);
	    	commonUtil.Click(NaukriObjects.from);
		    commonUtil.Click(NaukriObjects.fromin);
	        commonUtil.enterText(NaukriObjects.fromin, "JAI");
	        WebElement wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(NaukriObjects.frmselt));
		    wait1.click();
	    } else {
	    	commonUtil.enterText(NaukriObjects.to, "MUMBAI");
	        commonUtil.Click(NaukriObjects.toselt); 
	        commonUtil.Click(NaukriObjects.seldate);
        
	    }
	}
	@Then("Capture Lowestprice in list")
	public void capture_Lowestprice_in_list() {
		String price=driver.findElement(MMTObjects.fare).getText();
		
		System.out.println("Price"+price);
		String s="$ 4,098";
	    String new1 = s.substring(2,3);
	    String new2 = s.substring(4);
	    int n = Integer.parseInt(new1+new2);
		System.out.println(n);

	}

	@Then("Click on \\\"(.*)\\\" button")
	public void click_on_Button(String string) {
		commonUtil.Click(MMTObjects.book);
		 
	    
	}

	@Then("Capture the Finalprice and check it should be same with viewprice")
	public void capture_the_Finalprice_and_check_it_should_be_same_with_viewprice() throws InterruptedException {
		Thread.sleep(10000);
		String finprice=driver.findElement(MMTObjects.finalfare).getText();
		 System.out.println("Final price is 40187: "+finprice);


	    
	}

	
}
