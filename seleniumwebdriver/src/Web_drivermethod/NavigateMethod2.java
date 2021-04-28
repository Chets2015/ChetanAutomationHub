package Web_drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod2 {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Desktop//Selenium//chromedriver.exe/");
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("http://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	NavigateMethod2 n1=new NavigateMethod2();
	n1.navigate2();
}
	public void navigate2() throws InterruptedException{
	driver.navigate().to("http://www.amazon.com/");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	NavigateMethod2.colsebrowser();
}
	public static void colsebrowser() {
	driver.close();
}
}
