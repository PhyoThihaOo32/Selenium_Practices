package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement r1 = driver.findElement(By.id("radio-button-1"));
		r1.click();
		
		WebElement r2 = driver.findElement(By.xpath("//input[@value=\"option2\"]"));
		r2.click();
		
		WebElement r3 = driver.findElement(By.xpath("//input[@value=\"option3\"]"));
		r3.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
