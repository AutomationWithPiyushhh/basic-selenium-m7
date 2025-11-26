package working_with_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
//		used to load the URL. Must be a fully qualified path
		driver.get("https://www.instagram.com/");
//		fully qualified path => if not => InvalidArgumentException
		
//		to Get the title of the current page.
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
