package Web_drivermethod;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitPractice {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new ChromeDriver();
//	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.flipkart.com/");
	//Implictely wait
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//WebElement ele=driver.findElement(By.xpath("//li[@class]/a[text()='Deals']"));
	//ele.click();
	
	//Explicitely wait -------webdriver wait
	    WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		wait.until(ExpectedConditions.visibilityOf(element)).click();
		
	/*
	 * FluentWait wait = new FluentWait(ele); 
	 * wait.withTimeout(30,TimeUnit.SECONDS); 
	 wait.pollingEvery(5, TimeUnit.SECONDS);
	 * wait.ignoring(NoSuchElementException.class);
	 */

}
}
