package MeganLewis_LinkedlnLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteFields {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.click();
		autocomplete.sendKeys("8368 Vietor Ave Queens NY 11373");
		
		driver.quit();
		
		
		
	}
	
}
