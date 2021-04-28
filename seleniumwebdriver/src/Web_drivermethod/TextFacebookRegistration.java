package Web_drivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFacebookRegistration {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test Selenium");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.navigate().to("http://www.amazon.com/");
	
	//driver.navigate().back();
	//driver.navigate().to("https://www.facebook.com");
	//driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
	//driver.navigate().back();
	driver.close();
	
	
	
}
	
}
