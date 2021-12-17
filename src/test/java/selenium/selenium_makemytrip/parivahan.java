package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parivahan {
	
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://parivahan.gov.in/parivahan//en/content/vehicle-related-services");
		Select sel = new Select(driver.findElement(By.xpath(("//select[@name=\"aa\"]"))));
		sel.selectByVisibleText("Tamil Nadu");
	}
}
