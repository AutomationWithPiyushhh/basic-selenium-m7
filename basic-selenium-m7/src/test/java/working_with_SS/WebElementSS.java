package working_with_SS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementSS {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@id,'u_0_')]"));
		File source = login.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ss/login.png");
		
		FileHandler.copy(source, dest);
		
		driver.quit();
		
		
		
	}
}
