package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6 {
	
	static WebDriver driver;
  @Test
  public void test6() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	
		//Will Maximize the window
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//Will get size of the window
		Thread.sleep(1000);
		driver.manage().window().getSize();
		
		
		//Use of setSize() to change dimensions
		Dimension d = new Dimension(450,630);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		
		
		driver.quit();
	  
  }
}
