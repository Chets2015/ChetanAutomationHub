package Web_drivermethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToWindow {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.xpath("//li[@class]/a[text()='Deals']")).sendKeys(Keys.CONTROL, Keys.ENTER);
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		for (String child : windows) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//span[text()='Tech']")).click();
				Thread.sleep(3000);
				driver.quit();

			}

		}

	}
}
