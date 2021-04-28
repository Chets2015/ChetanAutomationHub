package Web_drivermethod;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToWindow1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//li[@class]/a[text()='Deals']")).sendKeys(Keys.CONTROL,Keys.ENTER);
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		ArrayList<String> child=new ArrayList(windows);
		driver.switchTo().window( child.get(1));
		driver.findElement(By.xpath("//span[text()='Tech']")).click();
	    driver.quit();
	}
	
}
