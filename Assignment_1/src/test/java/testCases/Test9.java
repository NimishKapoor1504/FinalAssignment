package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test9 {
	
	static WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
	  String filePath = "C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\src\\test\\java\\testCases\\Config.properties";
	  
	  FileInputStream file = new FileInputStream(filePath);
	  
	  Properties prop = new Properties();
	  prop.load(file);
	  System.out.println(prop.getProperty("url"));
	  driver.get(prop.getProperty("url"));
	  Thread.sleep(1000);
	  
	  
  }
  @BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}

	@AfterMethod
		public void afterMethod() {
		driver.quit();
	}
}
