package Practices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingCheckBoxes {
	
	public static WebDriver driver;
	
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.travelocity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='add-flight-switch']")).click();
		driver.findElement(By.xpath("//input[@name='add-car-switch']")).click();
		
		
		WebElement cancel =driver.findElement(By.xpath("//button[@class='uitk-card-link']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(cancel);
		act.perform();
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(checkboxes.size());
		
		for(int i=0;i<checkboxes.size();i++) {
			
			System.out.println(checkboxes.get(i).getText());
			System.out.println(checkboxes.get(i).getAttribute("aria-label"));
			
		}
		
		driver.quit();
		
		
		
		
	}

}
