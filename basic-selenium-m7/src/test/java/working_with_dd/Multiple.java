package working_with_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:/Users/User/git/Basic-Sel-M7/basic-selenium-m7/src/test/java/HTML/multiselect.html");
		
		Thread.sleep(3000);
		
		
		WebElement comDD = driver.findElement(By.id("coms"));
		Select selCom = new Select(comDD);

		selCom.selectByIndex(1);
		selCom.selectByIndex(3);
		selCom.selectByIndex(5);
		
		WebElement firstSelected = selCom.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		
		List<WebElement> selected = selCom.getAllSelectedOptions();
		for (WebElement i : selected) {
			System.out.println(i.getText());
		}
		
		if (selCom.isMultiple()) {
			selCom.deselectAll();
		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
