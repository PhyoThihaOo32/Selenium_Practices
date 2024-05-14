package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveHover {
	
public static WebDriver driver;
	
	public static void main(String[]args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[1]/ul/li[3]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();
	}

}
