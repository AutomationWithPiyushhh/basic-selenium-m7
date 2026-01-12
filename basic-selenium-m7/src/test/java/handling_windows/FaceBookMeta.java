package handling_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookMeta {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
//		1. get the home address
		String parentID = driver.getWindowHandle();
		
//		2. perform the task which will open new window/windows
		driver.findElement(By.linkText("Meta Pay")).click();
		
//		3. get all the window addresses
		Set<String> IDs = driver.getWindowHandles();
		
//		4. traverse through all the windows
		for (String i : IDs) {
			driver.switchTo().window(i);
			
//			5. check whether your desired window is there or not
//				if it is there, then break the loop
			if (driver.getTitle().contains("Meta")) {
				break;			
			}
		}
		
//		6. perform the task 
		driver.findElement(By.linkText("Check availability")).click();
		
//		7. get back home
		driver.switchTo().window(parentID);
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
