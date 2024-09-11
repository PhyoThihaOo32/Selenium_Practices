package MeganLewis_LinkedlnLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration; // Import Duration for setting timeout

public class JavaScriptExecutor {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");
        driver.manage().window().maximize();
        
        // Click to open the modal
        WebElement button = driver.findElement(By.id("modal-button"));
        button.click();
        
        // Correct WebDriverWait initialization with Duration
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("close-button")));
        
        // Click the close button using JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);
        
        // Wait for a few seconds to observe the action
        Thread.sleep(3000);
        
        // Close the driver
        driver.close();
        driver.quit();
    }
}