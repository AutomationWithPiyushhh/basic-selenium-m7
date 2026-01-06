package working_with_frames;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListenerException;
import org.openqa.selenium.support.ui.Select;

public class DemoFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("iframeResult");
		
		WebElement frame = driver.findElement(By.xpath("//div[@id='iframewrapper']/child::iframe"));
		driver.switchTo().frame(frame);

		WebElement carDD = driver.findElement(By.id("cars"));

		Select selCar = new Select(carDD);

		List<WebElement> cars = selCar.getOptions();
		int totalCars = cars.size();
		
		for (int i = 0; i < totalCars; i++) {
			selCar.selectByIndex(i);
			Thread.sleep(500);
		}
		
		Thread.sleep(5000);
		driver.quit();

	}
}
