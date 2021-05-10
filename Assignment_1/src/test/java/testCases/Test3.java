package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	
	static WebDriver driver;
  @Test
  public void test3() throws InterruptedException {
	  driver.findElement(By.id("windowButton")).click();
	  Thread.sleep(2000);
	  
	  
	  
  }
  
  @BeforeMethod
  public void setUp(){
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
	}

	@AfterMethod
		public void afterMethod() {
		driver.quit();
	}
}
