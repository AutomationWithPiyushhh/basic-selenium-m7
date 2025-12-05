package working_with_webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Thread.sleep(3000);
		
		Window win = driver.manage().window();
		
//		Set the size of the current window. 
//		This will change the outer window dimension, 
//		not just the view port
		Dimension dim1 = new Dimension(500, 500);
//										w    h
		win.setSize(dim1);

		Thread.sleep(2000);
		
		Point pt1 = new Point(250, 250);
//							   x    y
		
//		Set the position of the current window. 
//		This is relative to the upper left corner of the screen, 
		win.setPosition(pt1);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
