package working_with_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Heroku {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		
//		IMPLICIT WAIT
		
//		step 1 => click on remove
//		WebElement remove = driver.findElement(By.xpath("//button[text()='Remove']"));
//		remove.click();

//		step 2 => click on add
//		WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
//		add.click();
		
//		EXPLICIT WAIT
		
//		step 1> click on enable
		WebElement enable = driver.findElement(By.xpath("//button[text()='Enable']"));
		enable.click();
		
		
		
//		step 2> write the value in input
		WebElement input = driver.findElement(By.cssSelector("input[type='text']"));

//		wait until its enabled....
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(input));
		
//		once it is enabled => pass the value	
		input.sendKeys("1234567890");
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
