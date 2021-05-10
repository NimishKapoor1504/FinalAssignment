package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {
	
	static WebDriver driver;
  
  @Test(dataProvider="SearchProvider")
  public void test1(String author,String searchKey) throws InterruptedException{
  {
      WebElement searchText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
      //search value in google search box
      searchText.sendKeys(searchKey);
      System.out.println("Your Search key"+searchKey);
      Thread.sleep(3000);
      String testValue = searchText.getAttribute("value");
      
      searchText.clear();
 
      Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
  }
  }
  /**
   * @return Object[][] where first column contains 'author'
   * and second column contains 'searchKey'
   */

  @DataProvider(name="SearchProvider")
  public Object[][] getDataFromDataprovider(){
  return new Object[][] 
  	{
          { "Nimish", "India" },
          { "Krishna", "UK" },
          { "Bhupesh", "USA" }
      };

  }
  
  @BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://google.com");
	}

	@AfterMethod
		public void afterMethod() {
		driver.quit();
	}
  
}
