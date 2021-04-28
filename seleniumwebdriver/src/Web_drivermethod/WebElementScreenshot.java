package Web_drivermethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementScreenshot {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebElement logineButton = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
		
		driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("C:\\Users\\Admin\\Desktop\\Selenium\\LogineButton.jpg"));
		driver.close();
	}

}
