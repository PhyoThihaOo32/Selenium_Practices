package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageScrolling {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://formy-project.herokuapp.com/scroll");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("name"));
		Actions action = new Actions(driver);
		action.moveToElement(name);
		
		name.sendKeys("Phyo");
		
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("01/01/1991");
		
		driver.quit();
		
	}

}
