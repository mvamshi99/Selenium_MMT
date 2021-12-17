package utilities;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtils {
	public static WebDriver driver;
	
	public void launchBrowser(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();		
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
		
		public static void TakesScreenshot() {
		try {
		TakesScreenshot src = (TakesScreenshot)driver;
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		 File destFile = new File(System.getProperty("user.dir")+"\\target\\cucumber-report\\screenshots\\"+System.currentTimeMillis()+".jpg");
//		 System.out.println(System.currentTimeMillis()+"    "+destFile);
		 FileUtils.copyFile(srcFile, destFile);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
