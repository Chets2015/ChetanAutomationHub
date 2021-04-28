package web_drivermethodPractice;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenshotMethod22 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot sc= (TakesScreenshot)driver;
		File scr= sc.getScreenshotAs(OutputType.FILE);
		//String dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd_hh_mm_ss").format(new java.util.Date());
		FileUtils.copyFile(scr, new File("D:\\Selinum\\ScreenShotFile\\screenshot.jpg"));

			/*Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			String formattedDate = sdf.format(date);
			System.out.println(formattedDate);*/
		
		driver.close();
		
	}
}
