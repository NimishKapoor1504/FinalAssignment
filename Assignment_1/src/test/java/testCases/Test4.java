package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {
	static WebDriver driver;
  @Test
  public void test4() throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("infosys");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li[9]/div/div[2]/div[1]/span")).click();
	  Thread.sleep(1000);
	  /* Select s1 = new Select(driver.findElement(By.xpath("//*[@id="header-search-form"]/div[1]/div/div/ul/li[5]")));
	  s1.selectByIndex(5);
	  Thread.sleep(1000);*/
	  
	  
  }
  
  @BeforeMethod
  public void setUp(){
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
		public void afterMethod() {
		driver.quit();
	}
  
}
