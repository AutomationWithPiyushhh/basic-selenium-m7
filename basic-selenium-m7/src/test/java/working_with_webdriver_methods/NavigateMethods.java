package working_with_webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Thread.sleep(2000);

		String fb = "https://facebook.com/";
		URL url = new URL("https://facebook.com/");

		Navigation nav = driver.navigate();

//		nav.to(fb);
		nav.to(url);

		Thread.sleep(2000);
		nav.back();

		Thread.sleep(2000);
		nav.refresh();

		Thread.sleep(2000);
		nav.forward();

		Thread.sleep(2000);
		driver.quit();
	}
}
