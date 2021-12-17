package selenium.selenium_makemytrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zomato {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver.get("https://www.zomato.com/");
		WebElement search=driver.findElement(By.xpath("//a[text()=\"Log in\"]"));
			search.click();
			//WebElement search1=driver.findElement(By.xpath("//input[@placeholder=\"Phone number\"]"));
			WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Phone number\"]")));
			wait.sendKeys("8074307046");
			WebElement search2=driver.findElement(By.xpath("//span[text()=\"Send OTP\"]"));
			search2.click();
				
	}

}
