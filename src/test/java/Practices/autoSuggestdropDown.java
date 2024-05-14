package Practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggestdropDown {

	public static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
		
		search.click();
		search.sendKeys("Oregon");
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 a4c1805887 f671049264 d2529514af c082d89982 cceeb8986b']")).click();
		
}
}
