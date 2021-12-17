package selenium.selenium_makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
	public static void main (String[]args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|529579609614&s_kwcid=AL!1631!3!529579609614!e!!g!!make%20my%20trip&ef_id=EAIaIQobChMImLjn4_Ky9AIViYeRCh3XqwNjEAAYASAAEgI8pfD_BwE:G:s&gclid=EAIaIQobChMImLjn4_Ky9AIViYeRCh3XqwNjEAAYASAAEgI8pfD_BwE");
		driver.findElement(By.xpath("//*[text()=\"From\"]")).click();
	
	}

}
