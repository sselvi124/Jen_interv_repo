package jenPack1Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Jen1Test {
//	@Parameters("Browser")
@Test 

public void m1() {
//		if(browser.equalsIgnoreCase("firefox")) {
//		 	WebDriver driver= new FirefoxDriver();
//		}else if(browser.equalsIgnoreCase("chrome")) {
//			WebDriver	driver= new ChromeDriver();
//		}
//		
		
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	System.out.println("flipkart launched in firefox browser successfully");
	System.out.println("smoke suite");
	
	}

}

