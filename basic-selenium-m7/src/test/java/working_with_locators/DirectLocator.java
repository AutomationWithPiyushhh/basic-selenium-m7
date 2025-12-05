package working_with_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.className("xwhw2v2")).click();
		
		
//		link text
//		driver.findElement(By.linkText("Forgot password?"));
//		partial link text
//		driver.findElement(By.partialLinkText("Forgot"));

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
//		class="_aa4b _add6 _ac4d _ap35"
//		class="_aa4b _add6 _ac4d _ap35"
//		Thread.sleep(2000);
//		for (WebElement i : links) {
//			String value = i.getAttribute("class");
//			System.out.println(value);
////			i.click(); ---> javascript selenium 
//		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}