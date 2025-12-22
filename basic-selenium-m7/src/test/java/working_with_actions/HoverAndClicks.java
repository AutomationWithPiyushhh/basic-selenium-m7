package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAndClicks {
	public static void main(String[] args) throws InterruptedException {
//		1. hover
//		2. left click
//		3. right click
//		4. double click
//		5. click and hold
//		6. release 
//		7. drag and drop
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));

		Actions act = new Actions(driver);
		act.moveToElement(forgot).build().perform();

//		Thread.sleep(2000);
//		act.contextClick().build().perform();

		act.click().build().perform();

		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement doubleButton = driver.findElement(By.tagName("button"));

		act.doubleClick(doubleButton).build().perform();

		Thread.sleep(5000);
		driver.quit();
	}
}
