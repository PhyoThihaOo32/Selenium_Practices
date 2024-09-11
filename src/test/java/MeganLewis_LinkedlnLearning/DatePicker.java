package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		
		datePicker.sendKeys("01/01/1991");
		
		Thread.sleep(2000);
		
		datePicker.sendKeys(Keys.RETURN);
		
		driver.quit();

		
		
	}
	

	

}
