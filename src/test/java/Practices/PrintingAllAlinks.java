package Practices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingAllAlinks {
	
	public static WebDriver driver;
	
	public static void main(String[]args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		List<WebElement> allTags=driver.findElements(By.tagName("a"));
		System.out.println(allTags.size());
		
		for(int i=0; i<allTags.size();i++) {
			
			System.out.println(allTags.get(i).getAttribute("href"));
			System.out.println(allTags.get(i).getText());
		}
		
		driver.quit();
		
		
		
	}

}
