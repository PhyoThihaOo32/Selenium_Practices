package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		//Here as well
		
	}
	
}
