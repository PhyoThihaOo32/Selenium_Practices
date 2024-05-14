package Practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleDropDown2 {
	
	public static WebDriver driver;

	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement ddown=driver.findElement(By.xpath("//select[@id='cars']"));
		WebElement colordd=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select selectcar = new Select(ddown);
		Select color = new Select(colordd);
		
		color.selectByVisibleText("Yellow");
		System.out.println(color.getFirstSelectedOption().getText());
		
		selectcar.selectByIndex(1);
	
		selectcar.selectByIndex(2);
		
		selectcar.selectByIndex(3);
		
		System.out.println(selectcar.getFirstSelectedOption().getText());
		List<WebElement> myItems = selectcar.getAllSelectedOptions();
		
		System.out.println(myItems.size());
		selectcar.deselectByIndex(2);
	
		selectcar.deselectByIndex(3);
		List<WebElement> NewItems = selectcar.getAllSelectedOptions();
		System.out.println(NewItems.size());
		System.out.println(NewItems.toString());
		
		
		
		
	}
	
}
