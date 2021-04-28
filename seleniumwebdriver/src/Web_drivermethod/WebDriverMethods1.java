package Web_drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverMethods1 
{
public static void main(String[] args) throws InterruptedException 
{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\Driver\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	String pageSource=driver.getPageSource();
	System.out.println("Page Source : "+pageSource);
	String title=driver.getTitle();
	System.out.println("Title of page : "+title);
	String currentUrl=driver.getCurrentUrl();
	System.out.println("Current Page URL:  "+currentUrl);
	driver.close();
}   
}
