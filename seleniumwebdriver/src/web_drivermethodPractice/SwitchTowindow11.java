package web_drivermethodPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTowindow11 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String parent=driver.getWindowHandle();
	driver.findElement(By.xpath("//a[text()='Gift Cards']")).sendKeys(Keys.CONTROL,Keys.ENTER);
	Set<String> windows=driver.getWindowHandles();
	for(String child:windows) {
		if(!parent.equals(child)) {
			driver.switchTo().window(child);
	driver.findElement(By.xpath("//a[text()='festivals and more']")).click();
		driver.quit();
}
	}}}
