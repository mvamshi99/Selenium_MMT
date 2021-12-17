package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[]args) {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement search=driver.findElement(By.xpath("//*[@name=\"email\"]"));
	search.sendKeys("0123456789");
	WebElement search1=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	search1.sendKeys("123456789");
	search1.sendKeys(Keys.ENTER);
			

}}
