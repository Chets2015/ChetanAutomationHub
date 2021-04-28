package Web_drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(5000);
driver.manage().window().maximize();
String pagesource = driver.getPageSource();
System.out.println("Page Source;" + pagesource);
String title = driver.getTitle();
System.out.println("GetTitle:" + title);
String cu =  driver.getCurrentUrl();
System.out.println("current url:" +cu);


driver.close();




}
}
