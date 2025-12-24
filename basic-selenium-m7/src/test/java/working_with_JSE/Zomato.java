package working_with_JSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.zomato.com/");
		
//		1> typecaste to JSE 
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.location='https://www.zomato.com/';");
		
////		scrollBy
//		jse.executeScript("window.scrollBy(0,500);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollBy(0,500);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollBy(0,500);");
//		Thread.sleep(1000);
//
////		scrollTo
//		jse.executeScript("window.scrollTo(0,500);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollTo(0,500);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollTo(0,500);");
//		Thread.sleep(1000);
		
//		String title = driver.getTitle();
		
		String title = (String) jse.executeScript("return document.title;");
		
		System.out.println(title);
		
		
		
		
		
		driver.quit();
	}
}
