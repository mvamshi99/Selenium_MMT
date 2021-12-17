package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
	
	
	}


	}


