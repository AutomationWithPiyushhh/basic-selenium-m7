package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://the-internet.herokuapp.com/basic_auth");

//		modify the url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		
		Thread.sleep(3000);
		driver.quit();
	}
}
