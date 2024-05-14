package Practices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleDropDown {
	
	public static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("Business & Industrial");
		Thread.sleep(2000);
		
		s.selectByValue("6000");
		Thread.sleep(2000);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
//		System.out.println(s.getOptions());
		
//		s.selectByValue("2984");
		
//	List<WebElement> myElements = s.getOptions();
//		
//		for(WebElement str: myElements) {
//			
//			System.out.println(str);
//			
//		}
		
		
	}

}
