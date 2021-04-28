package Web_drivermethod;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotByAshotMethod {
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	AShot ashot =new AShot();
	//ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
	Screenshot sc= ashot.takeScreenshot(driver);
	BufferedImage src= sc.getImage();
	ImageIO.write(src, "jpg", new  File("C:\\Users\\Admin\\Desktop\\Selenium\\Ashot2.jpg"));
	driver.close();
	
}
	
}
