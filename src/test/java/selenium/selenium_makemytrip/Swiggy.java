package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[]args){
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		WebElement search1=driver.findElement(By.xpath("//a[text()=\"Sign up\"]"));
				search1.click();
		WebElement search2=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		search2.sendKeys("8074307046");
		WebElement search3=driver.findElement(By.xpath("//input[@name=\"name\"]"));
		search3.sendKeys("Sravan kumar");
		WebElement search4=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		search4.sendKeys("ksravan225225@gmail.com");
		WebElement search5=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		search5.sendKeys("Password@123");
		WebElement search6=driver.findElement(By.xpath("//a[@class=\"a-ayg\"]"));
		search6.click();
			}
}
