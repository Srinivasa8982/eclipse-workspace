package sri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testngexample {

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub

		
		public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    public String driverPath = "C:\\Chromedriver.exe";
	   public  WebDriver driver; 
	     
	     @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	          System.setProperty("webdriver.gecko.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	     }
	      
	      @Test
	      public  void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
		
	      }
	
	
	}
}
}
}
	      