package working_with_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://shoppersstack.com/products_page/26");
		
		Thread.sleep(15000);
		
		WebElement zip = driver.findElement(By.id("Check Delivery"));
		zip.sendKeys("201301");
		
//		Explicit wait
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		
//		Fluent Wait
//		FluentWait wait2 = new FluentWait(driver);
//		wait2.withTimeout(Duration.ofSeconds(15));
//		wait2.pollingEvery(Duration.ofMillis(100));
//		wait2.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		
		WebElement check = driver.findElement(By.id("Check"));
		check.click(); // 	ElementClickInterceptedException
		
		Thread.sleep(5000);
		driver.quit();
	}
}
