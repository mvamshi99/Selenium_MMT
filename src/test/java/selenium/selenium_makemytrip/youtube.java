package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement search=driver.findElement(By.xpath("//input[@id=\"search\"]"));
		search.click();
		search.sendKeys("prema o prema");
		search.sendKeys(Keys.ENTER); 	
	}

}
