package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
		
		dropDown.click();
		
		
		
		WebElement dropDownOption = driver.findElement(By.xpath("/html/body/div/div/div/a[9]"));
		
		dropDownOption.click();
		
		driver.quit();
	}

}
