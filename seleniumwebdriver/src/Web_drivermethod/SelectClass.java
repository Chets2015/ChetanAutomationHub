package Web_drivermethod;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("panda");
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("982");
		//driver.findElement(By.id("password_step_input")).sendKeys("123456");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select select = new Select(day);
		select.selectByIndex(25);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select select1 = new Select(month);
		select1.selectByVisibleText("Dec");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select select2 = new Select(year);
		select2.selectByValue("2020");
		Thread.sleep(2000);
		driver.quit();
		
}
}
