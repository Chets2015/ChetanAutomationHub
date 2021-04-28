package Web_drivermethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorPractice {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		System.out.println("Titletext by id:" + driver.findElement(By.id("glow-ingress-line2")).getText());
		String x1 = driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']")).getText();
		System.out.println("TextTitle by xpath:" + x1);
		System.out.println("TitleText by Linktext:" + driver.findElement(By.linkText("Best Sellers")).getText());
		List<WebElement> listofelement = driver.findElements(By.tagName("a"));
		int size = listofelement.size();
		System.out.println("Toatl size of Tags:" + size);
		//System.out.println("Title of text by ClassName:" + driver.findElement(By.className("hm-icon nav-sprite")).getText());
		driver.close();
		LocatorPractice.OpenBr();
	}
	public static void OpenBr() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
driver.get("https://www.ebay.com/");
driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirt");
driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("tshirt");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[contains(@id,'g')]")).clear();
driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("pant");
driver.findElement(By.xpath("//input[contains(@id,'gh-btn')]")).click();
driver.close();
	}

}
