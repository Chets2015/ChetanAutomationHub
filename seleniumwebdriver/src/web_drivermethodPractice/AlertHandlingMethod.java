package web_drivermethodPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandlingMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/AlerMsg.html");
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		//This command is used to first switch to alert and then accept or dismiss the alert if message is their it also get it
		Alert alert=driver.switchTo().alert();;
		Thread.sleep(5000);
		//alert.accept();
        alert.dismiss();
		
		
	}

}
