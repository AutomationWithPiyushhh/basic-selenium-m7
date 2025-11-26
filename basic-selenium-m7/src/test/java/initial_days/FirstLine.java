package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstLine {
	public static void main(String[] args) {
//		ctrl + space
		
		
		
		
		
//		ChromeDriver driver1 = new ChromeDriver();
//		
//		FirefoxDriver driver2 = new FirefoxDriver();
//		
//		EdgeDriver driver3 = new EdgeDriver();
	
		
		
//		Upcasting
//		RemoteWebDriver driver1 = new ChromeDriver();
//				
//		RemoteWebDriver driver2 = new FirefoxDriver();
//		
//		RemoteWebDriver driver3 = new EdgeDriver();

		
		
		
//		poly-morphism
//		RemoteWebDriver driver = new ChromeDriver();
//				
//						driver = new FirefoxDriver();
//		
//						driver = new EdgeDriver();

//		upcast till webdriver 
		  WebDriver driver = new ChromeDriver();
		  
	/*	webdriver is a type
	 *  driver is a ref var
	 *  new is a keyword which will create random memory space
	 *  in heap area
	 *  constructor call has 3 jobs
	 *  1> start the server
	 *  2> launch the empty chrome browser
	 *  3> load reg and reinitialize the non static members
	*/
		  
		  
//					driver = new FirefoxDriver();
//	
//					driver = new EdgeDriver();
			
	}
}
//System.setProperty("webdriver.edge.driver", "path of exe file");
