package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAndMouseInput {

	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/keypress");
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.id("name"));
		
		input.click();
		input.sendKeys("Hello");
		
		WebElement button = driver.findElement(By.xpath("//button[@id=\"button\"]"));
		
		button.click();
		
		driver.close();
		driver.quit();
		
		
	}
	
}
