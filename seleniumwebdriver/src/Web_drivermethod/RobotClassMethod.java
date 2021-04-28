package Web_drivermethod;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassMethod {
public static void main(String[] args) throws AWTException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	Robot robot = new Robot();
	System.out.println(robot.getPixelColor(10, 20));
	Rectangle rect = new Rectangle();
	rect.setFrame(0, 0, 1000, 1000);
	BufferedImage image=robot.createScreenCapture(rect);
	ImageIO.write(image, "png", new File("C:\\Users\\Admin\\Desktop\\Selenium\\chetan11.png"));
}
}
