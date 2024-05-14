package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe2 {
	
public static WebDriver driver;
	
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.switchTo().frame("mce_0_ifr");
		
		WebElement text = driver.findElement(By.xpath("//body[@id=\"tinymce\"]"));
		text.clear();
		text.sendKeys("Hello World");
		
	}
	

}
