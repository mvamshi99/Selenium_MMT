package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[]args) throws InterruptedException {
	WebDriver  driver = new ChromeDriver(); 
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver.manage().window().maximize();
	driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	WebElement search=driver.findElement(By.xpath("//a[@data-action=\"sign in\"]"));
	search.click();
	WebElement search1=driver.findElement(By.xpath("//*[@aria-label=\"Email or phone\"]"));
	search1.sendKeys("ksravan225225@gmail.com");
	search1.sendKeys(Keys.ENTER);		
	
	
	
	
	
	}}