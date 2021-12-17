package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NaukriObjects {
	public static By loginBtn = By.xpath("//div[text()='Login']");
	public static By zomatoPh = By.xpath("//input[@placeholder=\"Phone number\"]");
	public static By pnenmbr=By.xpath("//div[@class=\"makeFlex column flexOne\"]");
	public static By fltrmr=By.xpath("//span[@class=\"langCardClose\"]");
	public static By numbr=By.id("username");
	public static By contne=By.xpath("//button[@data-cy=\"continueBtn\"]");
	public static By loginacc=By.xpath("//li[@data-cy=\"account\"]");
	public static By from=By.xpath("//label[@for=\"fromCity\"]");
	public static By fromin=By.xpath("//input[@placeholder=\"From\"]");
	public static By frmselt=By.xpath("//div[text()=\"JAI\"]");
	public static By to=By.xpath("//input[@placeholder=\"To\"]");
	public static By seldate=By.xpath("//div[@aria-label=\"Fri Dec 24 2021\"]");
	public static By toselt=By.xpath("//p[text()='SUGGESTIONS ']/parent::div/following-sibling::ul//div[text()=\"BOM\"]");
	public static By Search=By.xpath("//a[text()=\"Search\"]");
	public static By fltrmr1=By.xpath("//span[@class=\"bgProperties icon20 overlayCrossIcon\"]");
	public static By flight=By.xpath("//span[text()=\"View Prices\"][1]");
	public static By bookflt=By.xpath("//button[text()=\"Book Now\"][1]");
	public static By etkog=By.xpath("//a[@class=\"user\"]");	
	public static By btnName(String name) {
		return By.xpath("//*[text()=\""+name+"\"]");
	
	}
	
	
}
 