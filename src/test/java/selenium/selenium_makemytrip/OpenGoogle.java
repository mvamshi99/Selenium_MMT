package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		search.click();	
		search.sendKeys("selenium");
		search.sendKeys(Keys.ENTER);
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("selenium - Google Search", title1);
		driver.findElement(By.xpath("//a[@href=\"https://www.selenium.dev/\"]/h3[text()=\"Selenium\"]")).click();
		Assert.assertEquals("Selenium", driver.getTitle());

	}

}
