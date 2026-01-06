package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("alert('welcome to automationwithpiyush!!!');");

		Thread.sleep(2000);
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.accept();

		Thread.sleep(1000);

		jse.executeScript("confirm('Are you sure you wanna become SDET?');");

		Thread.sleep(2000);
		System.out.println(ale.getText());
		ale.dismiss();
		
		Thread.sleep(1000);

		jse.executeScript("prompt('Tell me your dream company:');");

		Thread.sleep(2000);
		System.out.println(ale.getText());
		ale.sendKeys("Tesla");
		ale.accept();
		
		Thread.sleep(1000);

		jse.executeScript("prompt('Tell me your dream company:');");

		Thread.sleep(2000);
		ale.dismiss();

		Thread.sleep(2000);
		driver.quit();
	}
}
