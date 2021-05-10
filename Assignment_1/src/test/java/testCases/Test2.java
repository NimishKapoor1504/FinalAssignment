package testCases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

static WebDriver driver;
	
	@Test
	public void test2() throws InterruptedException, IOException {
		WebElement From=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));	
        Thread.sleep(1000);
        //Element on which need to drop.		
        WebElement To=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));					
        Thread.sleep(1000);		
        //Using Action class for drag and drop.		
        Actions act=new Actions(driver);					

	//Dragged and dropped.		
        act.dragAndDrop(From, To).build().perform();		
	
	}		
  
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
		public void afterMethod() {
		driver.quit();
	}
}
