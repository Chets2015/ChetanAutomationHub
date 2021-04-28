package Web_drivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	public static void main(String[] args)
	{

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//a[text()='Registry']")).click();
	driver.findElement(By.xpath("(//span[@class='gr-subnav__item-text'])[5]")).click();
	
	
	driver.close();
    
	
	}
}
