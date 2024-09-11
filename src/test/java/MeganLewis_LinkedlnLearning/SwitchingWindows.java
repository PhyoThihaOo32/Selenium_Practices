package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		
		WebElement switchButton = driver.findElement(By.id("new-tab-button"));
		switchButton.click();
		
		String originalWindow = driver.getWindowHandle();
		
		for(String handle1 : driver.getWindowHandles()) {
			
			driver.switchTo().window(handle1);
		}
		
//		driver.switchTo().window(originalWindow);
		
		
	}

}
