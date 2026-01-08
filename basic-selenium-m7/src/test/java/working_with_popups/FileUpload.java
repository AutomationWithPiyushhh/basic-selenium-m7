package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:/Users/User/git/Basic-Sel-M7/basic-selenium-m7/src/test/java/HTML/fileUpload.html");
		
		String path = "C:\\Users\\User\\OneDrive\\Desktop\\mock.pdf";
		
		Thread.sleep(3000);
		
		WebElement resume = driver.findElement(By.cssSelector("input[type='file']"));
		resume.sendKeys(path);
		
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
		WebElement resumeUpload = driver.findElement(By.id("resumeUpload"));
		resumeUpload.sendKeys(path);
		
//		Thread.sleep(3000);
//		driver.quit();
	}
}
