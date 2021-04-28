package Web_drivermethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMethod {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Customer_relationship_management");
	//WebDriverWait wait = new WebDriverWait(driver,10);
	//WebElement element=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	//wait.until(ExpectedConditions.visibilityOf(element)).click();
	String text=driver.findElement(By.id("firstHeading")).getText();
	System.out.println("Text of Title : "+text);
	String name = driver.findElement(By.className("toctext")).getText();
	System.out.println("Name: "+name);
	String link = driver.findElement(By.partialLinkText("Jump to")).getAttribute("href");
	System.out.println("partial_link : "+link);
	List<WebElement> listofString=driver.findElements(By.tagName("a"));
	int size= listofString.size();
    System.out.println("Size of link: "+size);
    
	for(int i=1;i<size;i++) {
		listofString.get(i).getText();
		System.out.println("List of all Link: "+listofString);
		driver.close();
	}	
	}
	}
