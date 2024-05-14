package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;
	public static String[] browsers = { "Chrome", "Edge", "FireFox" };

	public static void main(String[] args) {

		for (int i = 0; i < browsers.length; i++) {

			if (i == 0) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}

			else if (i == 1) {

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}

			else if (i == 2) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			}

			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			

		}
		
		driver.quit();

	}
	
}
