package Web_drivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("scroll(0,100)");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Help']"));
		jse.executeScript("arguments[0].scrollIntoView(true);",ele);
		WebElement ele1= driver.findElement(By.xpath("//a[@role='button']"));
		jse.executeScript("arguments[0].click();", ele1);
		Thread.sleep(5000);
		jse.executeScript("document.getElementById('password_step_input').value='Aahuja'");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
