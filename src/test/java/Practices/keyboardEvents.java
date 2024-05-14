package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardEvents {
	
public static WebDriver driver;
	
	public static void main(String[]args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(source,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement source2=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[3]/pre/span"));
		
		act.keyDown(source2, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
	}


}
