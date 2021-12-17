package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objectrepository.NaukriObjects;

public class CommonUtilities {
	public WebDriver driver;
//	public SeleniumUtils seleniumUtil;
	
	public CommonUtilities() {
		driver = SeleniumUtils.getDriver();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void Click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void selectTab(String tabName) {
		String upper = tabName.toLowerCase();
		upper = upper.substring(0, 1).toUpperCase()+upper.substring(1);
		driver.findElement(By.xpath("//li//div[text()='"+upper+"']")).click();
		}
	
	
	 public void enterText(By locator, String value) {
		 driver.findElement(locator).sendKeys(value);
		
	}
	
}
