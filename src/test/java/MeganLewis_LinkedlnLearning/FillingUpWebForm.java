package MeganLewis_LinkedlnLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillingUpWebForm {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.click();
		firstName.sendKeys("Phyo");
		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.click();
		lastName.sendKeys("Oo");
		
		WebElement jobTitle = driver.findElement(By.xpath("//input[@id='job-title']"));
		jobTitle.click();
		jobTitle.sendKeys("SDET");
		
		
		
		WebElement education = driver.findElement(By.xpath("//input[@id='radio-button-2']"));
		education.click();
		
		WebElement gender = driver.findElement(By.id("checkbox-1"));
		gender.click();
		
		WebElement experience = driver.findElement(By.id("select-menu"));
		Select menu = new Select(experience);
		
		menu.selectByVisibleText("10+");
		
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("09/10/2024");
		date.sendKeys(Keys.RETURN);
		
		
		WebElement submit = driver.findElement(By.xpath("//a[text()='Submit']"));
		submit.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success']")));
		
		
		
		Assert.assertEquals("The form was successfully submitted!", message.getText());
		
		driver.quit();
		
		
	}

}
