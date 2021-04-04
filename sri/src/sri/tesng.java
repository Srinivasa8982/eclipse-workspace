package sri;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

package firsttestngpackage;
public class tesng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		public class firsttestngfile {
		    public String baseUrl = "http://demo.guru99.com/test/newtours/";
		    String driverPath = "C:\\chromedriver.exe";
		    public WebDriver driver ; 
		     
		  @Test
		  public void verifyHomepageTitle() {
		       
		      System.out.println("launching firefox browser"); 
		      System.setProperty("webdriver.gecko.driver", driverPath);
		      driver = new FirefoxDriver();
		      driver.get(baseUrl);
		      String expectedTitle = "Welcome: Mercury Tours";
		      String actualTitle = driver.getTitle();
		      Assert.assertEquals(actualTitle, expectedTitle);
		      driver.close();
		  }
		}

	}

}
