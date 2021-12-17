package selenium.selenium_makemytrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlemaps {
public static void main(String[]args) {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver.manage().window().maximize();
	driver.get("https://maps.google.com/");
	WebElement search=driver.findElement(By.xpath("//input[@aria-label=\"Search Google Maps\"]"));
	search.click();
	search.sendKeys("BAWAIPALLE");
	search.sendKeys(Keys.ENTER);
	//WebElement search1=driver.findElement(By.xpath("//button[@aria-label=\"Directions to Maitri Enclave\"]"));
	WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-value=\"Directions\"]")));
	wait.click();
	WebElement search1=driver.findElement(By.xpath("//input[@placeholder=\"Choose starting point, or click on the map...\"]"));
	search1.click();
	search1.sendKeys("maitri enclave pupalguda");
	search1.sendKeys(Keys.ENTER);
}
}
