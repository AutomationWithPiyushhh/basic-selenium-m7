package working_with_webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("https://www.facebook.com/"); 
		
		Window win = driver.manage().window();
		
		win.maximize();
		Thread.sleep(3000);		
		win.minimize();
		Thread.sleep(3000);
		win.fullscreen();
		
//		Get the size of the current window. 
//		This will return the outer window dimension, not just the view port.

//		Dimension dim1 = driver.manage().window().getSize();
//		System.out.println(dim1);
		
//		int h = driver.manage().window().getSize().getHeight();
//		int h = dim1.getHeight();
		
//		int w = driver.manage().window().getSize().getWidth();
//		int w = dim1.getWidth();
//		System.out.println(w);
//		System.out.println(h);
		
		/*Get the position of the current window, 
		 *relative to the upper left corner of the screen.
		*/
//		Point pt1 = driver.manage().window().getPosition();
//		System.out.println(pt1);
//
////		int x = driver.manage().window().getPosition().getX();
//		int x = pt1.getX();
//		
////		int y = driver.manage().window().getPosition().getY();
//		int y = pt1.getY();
//		
//		System.out.println(x);
//		System.out.println(y);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
