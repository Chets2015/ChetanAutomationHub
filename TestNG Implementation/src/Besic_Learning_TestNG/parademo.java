package Besic_Learning_TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parademo {
	public static WebDriver driver;

	@Test
	@Parameters({"Browser","url"})
	public void rediff(String Browser,String url) {
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		}
		else if(Browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.className("signin")).click();
		//driver.findElement(By.id("login1")).sendKeys(emailid);
		//driver.findElement(By.id("password")).sendKeys("password");
		//driver.findElement(By.className("signinbtn")).click();
	}
}
