package Practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static WebDriver driver;

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"bookingCheckboxContainer\"]/div[1]/div[1]/label/span[1]")).isSelected());

		driver.findElement(By.xpath("//*[@id=\"bookingCheckboxContainer\"]/div[1]/div[2]/label/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"bookingCheckboxContainer\"]/div[2]/div/label/span")).click();
		
		driver.findElement(By.xpath("//input[@name='destinationAirport']")).sendKeys("portland");
		driver.findElement(By.xpath("//input[@name='destinationAirport']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@name='destinationAirport']")).sendKeys(Keys.ENTER);
		
		WebElement noPass= driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		
		Select sel= new Select(noPass);
		
		sel.selectByIndex(2);
		
		
	}
}