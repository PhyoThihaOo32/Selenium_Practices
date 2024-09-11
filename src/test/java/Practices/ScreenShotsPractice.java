package Practices;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsPractice {
	
	static WebDriver driver;
	
public static void main(String[] args) throws IOException {
	
	Date date = new Date();
	String sShotFileName = date.toString().replace(" ","-").replace(":", "-");
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	File screenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenShot, new File("/Users/phyothihaoo/Desktop/"+sShotFileName+".png"));
}

}
