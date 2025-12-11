package working_with_we_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.bytebuddy.matcher.FailSafeMatcher;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("admin");
		Thread.sleep(500);
		username.clear();
		Thread.sleep(500);
		username.sendKeys("admin@123");
		Thread.sleep(500);

		WebElement login = driver.findElement(By.name("login"));

		String tagOfLogin = login.getTagName();
		String dataTestId = login.getAttribute("data-testid");

		String fontSizeOfLogin = login.getCssValue("font-size");

		String textOfLogin = login.getText();

		System.out.println("tag of login : " + tagOfLogin);
		System.out.println("data test id : " + dataTestId);
		System.out.println("Font size of login : " + fontSizeOfLogin);
		System.out.println("text of login : " + textOfLogin);

		if (login.isDisplayed() && login.isEnabled()) {
			login.submit();
		}

		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/input"));
		WebElement femaleRadio = driver.findElement(By.xpath("//label[text()='Female']/input"));
		if (maleRadio.isDisplayed() && maleRadio.isEnabled()) {
			maleRadio.click();
		}

		if (maleRadio.isSelected()) {
			System.out.println("male is selected");
		} else if (femaleRadio.isSelected()) {
			System.out.println("female is selected");
		} else {
			System.out.println("other is selected");
		}

		Thread.sleep(1000);
		driver.quit();
	}
}
