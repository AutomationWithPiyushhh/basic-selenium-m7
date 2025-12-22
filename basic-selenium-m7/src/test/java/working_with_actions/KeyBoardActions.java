package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1. sendKeys() 2. keyDown() 3. keyUp()
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

//		act.sendKeys("admin" + Keys.TAB + "password" + Keys.TAB + Keys.TAB + Keys.ENTER).build().perform();
		
//		Actions act = new Actions(driver);
//		act.sendKeys("admin").build().perform();
//		act.keyDown(Keys.TAB).build().perform(); // key press
//		act.keyUp(Keys.TAB).build().perform(); // key release
//		act.sendKeys("password").build().perform();
//		act.keyDown(Keys.ENTER).build().perform(); // key press
//		act.keyUp(Keys.ENTER).build().perform(); // key release
		
		new Actions(driver)
			.sendKeys("admin")
			.keyDown(Keys.TAB)
			.keyUp(Keys.TAB)
			.sendKeys("password")
			.keyDown(Keys.ENTER)
			.keyUp(Keys.ENTER)
			.build().perform(); 
		
//		act.sendKeys("admin").build().perform();
//
//		act.keyDown(Keys.CONTROL).build().perform(); // press ctrl
//		act.sendKeys("a").build().perform();		
//		act.keyUp(Keys.CONTROL).build().perform(); //release

		new Actions(driver)
			.sendKeys("admin")
			.keyDown(Keys.CONTROL)
			.sendKeys("a")
			.keyUp(Keys.CONTROL)
			.build().perform();
		

		Thread.sleep(3000);
		driver.quit();

	}
}
