package Practices;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeBrowser {
	
	public static void main(String[]args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Uranus");
//		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		String ps = driver.getPageSource();	
		System.out.println(url);
		System.out.println(title);
		driver.navigate().to("https://equip.health/");
		String url1 = driver.getCurrentUrl();
		String title1 = driver.getTitle();
	
		System.out.println(url1);
		System.out.println(title1);
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		
		System.out.println(items);
		
		driver.navigate().to("https://equip.health/");
		String handles = driver.getWindowHandle();
		System.out.println(handles);
		

		driver.findElement(By.xpath("//div[@class='ρd__all ρd__div ρt ρmmYfM']")).click();
		Set<String>allHandles = driver.getWindowHandles();
		System.out.println(allHandles);
		
		
		
		
//		System.out.println(ps);
		
		
		
	
		
		
	
	}

}
