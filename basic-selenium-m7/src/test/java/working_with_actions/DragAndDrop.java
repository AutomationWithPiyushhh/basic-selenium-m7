package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(0);
		
		WebElement tatras1 = driver.findElement(By.cssSelector("img[src='images/high_tatras_min.jpg']"));
		WebElement tatras2 = driver.findElement(By.cssSelector("img[src='images/high_tatras2_min.jpg']"));
		WebElement tatras3 = driver.findElement(By.cssSelector("img[src='images/high_tatras3_min.jpg']"));
		WebElement tatras4 = driver.findElement(By.cssSelector("img[src='images/high_tatras4_min.jpg']"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(tatras1,trash).build().perform();

		Thread.sleep(500);
		
		act.dragAndDrop(tatras2,trash).build().perform();

		Thread.sleep(2000);
		
		act.dragAndDropBy(tatras3,200,50).build().perform();

		Thread.sleep(2000);
		
		act.dragAndDropBy(tatras4,200,50).build().perform();

		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
	}
}
