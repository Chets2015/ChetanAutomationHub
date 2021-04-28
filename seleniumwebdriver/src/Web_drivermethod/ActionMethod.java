package Web_drivermethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionMethod
{
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	WebElement target=driver.findElement(By.xpath("//li[@class]/a[text()='Deals']"));
	action.moveToElement(target).perform();
	//action.click(target).perform();
	//action.contextClick(target).perform();
	//action.doubleClick(target).perform();
	
	driver.close();
	
}
}
