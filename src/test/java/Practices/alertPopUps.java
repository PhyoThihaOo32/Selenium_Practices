package Practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertPopUps {
	
	public static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement button1= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	
		button1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement button2= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		button2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement button3= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		button3.click();
		Thread.sleep(2000);
		Alert alertText=driver.switchTo().alert();
		alertText.sendKeys("Hello Jollie");
		alertText.accept();
		
		
		
		
		
		
	}

}
