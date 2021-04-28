package Web_drivermethod;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class WaitANdScreenshot {
	public static void main(String[] args) throws IOException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebDriverWait wait =new WebDriverWait(driver,10);
	WebElement ele = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	wait.until(ExpectedConditions.visibilityOf(ele));
	AShot ashot =new AShot();
	//ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
	Screenshot sc= ashot.takeScreenshot(driver);
	BufferedImage src= sc.getImage();
	ImageIO.write(src, "jpg", new  File("C:\\Users\\Admin\\Desktop\\Selenium\\Ashot5.jpg"));
	WebElement text= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/p/span"));
	String Submit = text.getText();
	System.out.println(Submit);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	TakesScreenshot sc1 =(TakesScreenshot)driver;
	File src1=sc1.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src1, new File("C:\\Users\\Admin\\Desktop\\Selenium\\Ashot6.jpg"));
	
	WebElement logineButton= driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div.go_DOp._2errNR > div > div > div > a"));
	//TakesScreenshot ts=(TakesScreenshot)driver;
	File src2=logineButton.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src2, new File("C:\\Users\\Admin\\Desktop\\Selenium\\LogineButton.jpg"));
	
	
	
	
			
	}
	}

