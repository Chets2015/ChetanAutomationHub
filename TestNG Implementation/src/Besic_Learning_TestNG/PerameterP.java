package Besic_Learning_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerameterP {
	public static WebDriver driver;
    @Parameters("browserName")
	@BeforeMethod
	public void openBrowser(String bName) {
		switch (bName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "InternetExplorer":
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
			break;
		default:
			System.out.println("This browser is not valid");
		}
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test
	public void getURL() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("http://www.facebook.com");
	}
}
