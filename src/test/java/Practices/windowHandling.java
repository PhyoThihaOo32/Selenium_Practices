package Practices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandling {
	
	public static WebDriver driver;
	
	public static void main(String[]args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/sql/sql_not.asp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='trysql.asp?filename=trysql_select_not_gt']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		System.out.println(handles);
		
		Iterator<String>windows = handles.iterator();
		
		String parent =windows.next();
		System.out.println(parent);
		String child =windows.next();
		System.out.println(child);
		
		driver.switchTo().window(child);
		System.out.println(driver.getWindowHandle());
		
//		WebElement textArea =driver.findElement(By.xpath("//*[@id=\"tryitform\"]"));
//		
//		textArea.click();
//		textArea.clear();
//		textArea.sendKeys("select customername,city,country\n"
//				+ "from customers\n");
//		
//		driver.findElement(By.xpath("//button[@onclick='w3schoolsSQLSubmit();uic_r_p();']")).click();		
		
		
		driver.switchTo().window(parent);
		System.out.println(driver.getWindowHandle());
		
		
		
	}

}
