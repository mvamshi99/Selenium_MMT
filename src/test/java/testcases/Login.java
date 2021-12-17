package testcases;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import utilities.CommonUtilities;
import utilities.SeleniumUtils;

public class Login {
	public WebDriver driver;
	public SeleniumUtils seleniumUtil;
	public CommonUtilities commonUtil;
	
	public Login() {
		seleniumUtil = new SeleniumUtils();
		seleniumUtil.launchBrowser("Chrome"); 
		driver = SeleniumUtils.getDriver();
		commonUtil = new CommonUtilities();
	}
	
	@Given("^User enters \\\"(.*)\\\" and \\\"(.*)\\\"$")
	public void enter_given_and(String username, String Password) {
	    driver.get("https://www.facebook.com/");
//	    WebElement sign = driver.findElement(By.xpath("//a[contains(@class,'button') and text()='Sign in']"));
//	    WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(sign));
//	    signIn.click();
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(Password);
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on the \\\"(.*)\\\" Button$")
	public void click_on_the_Login_Button(String button) {
		driver.findElement(By.xpath("//button[text()='"+button+"']")).click();
	    throw new io.cucumber.java.PendingException();
	}

	
	
	@Given("^Go to \\\"(.*)\\\" website$")
	public void login_to_website(String url) {
	    driver.get(url);
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("Close floating box")
	public void close_floating_box() {
	    WebElement close= driver.findElement(By.xpath("//span[@class='langCardClose']"));
	    if(close.isDisplayed()) {
	    	close.click();
	    } else {
	    	System.out.println("No pop-up");
	    }
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("Capture Windows and close them")
	public void capture_Windows_and_close_them() throws InterruptedException {
		Thread.sleep(1000);
	    Set<String> windows = driver.getWindowHandles();
	    String[] a = new String[windows.size()];
	    int i=0;
	    String parent="";
	    for(String s:windows) {
	    	System.out.println(s);
	    	driver.switchTo().window(s);
	    	System.out.println(driver.getTitle());
	    	a[i] = s;
	    	i++;
	    	if(driver.getTitle().equals("Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com")){
	    		parent = s;
	    	}
//	    	if(driver.getTitle().equals("Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com")) {
//	    		System.out.print("Recutment");
//	    		driver.close();
//	    	} else if(driver.getTitle().equals("Cognizant")) {
//	    		driver.close();
//	    		System.out.print("Cognizant");
//	    	} 
	    }
	    driver.switchTo().window(parent);
	     commonUtil.getTitle();
	     commonUtil.selectTab("login");
	}

	


}
