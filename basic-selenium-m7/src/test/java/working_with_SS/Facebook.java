package working_with_SS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

//		1> downcasting
		TakesScreenshot tks = (TakesScreenshot) driver;

//		2> take the ss in file format
		File source = tks.getScreenshotAs(OutputType.FILE);

//		3> create the java representation object of the physical file

		String absPath = "C:\\Users\\User\\git\\Basic-Sel-M7\\basic-selenium-m7\\ss\\dummy1.png";
		String relPath = "./ss/dummy2.png";

		File destination = new File(relPath);

//		4> copy that content to the dummy file
		FileHandler.copy(source, destination);

		driver.quit();

	}
}
