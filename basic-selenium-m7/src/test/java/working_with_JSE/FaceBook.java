package working_with_JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String fb = "https://www.facebook.com/";
		String insta = "https://www.instagram.com/";
		String zom = "https://www.zomato.com/";

		jse.executeScript("window.location=arguments[0];", fb, insta, zom);

		WebElement un = driver.findElement(By.id("email"));
//		Java-Selenium
//		un.sendKeys("admin");
		
//		Javascript-Selenium
		String username = "admin";
		jse.executeScript("arguments[0].value = arguments[1]", un, username);
//								un 	   .value =  username;
//												  'admin'
		
		
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		// Java-Selenium
		// loginBtn.click();
		
		
		//Javascript-Selenium
		
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", loginBtn);
		
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement custom = driver.findElement(By.id("custom_gender"));
//		java-selenium
//		custom.sendKeys("Male");
		
//		javascript 
		jse.executeScript("arguments[0].value='Male'", custom);
		
		
		
		Thread.sleep(1000);
//		driver.quit();
	}
}
