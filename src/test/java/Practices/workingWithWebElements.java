package Practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workingWithWebElements {
	
	public static WebDriver driver;
	
	public static void main(String[]args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("windows blinds");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
		
//		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getAttribute("name"));
		
//		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getSize());
//		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//a[contains(@class,'nav-a  ')][24]")).getText());
//		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getTagName());
//		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled());
//		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isSelected());
	}

}
