package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main (String[]args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abcdefg@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcdefghijk");
//		driver.findElement(By.name("login")).click();                                                                                             mm
	}

}
