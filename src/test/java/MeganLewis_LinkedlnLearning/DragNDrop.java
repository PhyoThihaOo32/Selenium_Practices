package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		
		WebElement image = driver.findElement(By.id("image"));
		
		WebElement box = driver.findElement(By.id("box"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(image, box).perform();
		
		driver.quit();
		
	}

}
