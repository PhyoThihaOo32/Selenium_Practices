package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeIFrames3 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement dayNight = driver.findElement(By.xpath("//div[@id='tnb-google-search-mobile-show']"));
		
		dayNight.click();
		
		
	}

}
