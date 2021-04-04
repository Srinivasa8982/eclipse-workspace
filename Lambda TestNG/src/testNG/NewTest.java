package testNG;
/*
import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {
		
  public WebDriver driver;

@Test
    public void f() {
	  
	  String expectedTitle = "Google";
      String actualTitle = driver.getTitle();
      System.out.println(driver.getTitle());
        Assert.assertEquals(actualTitle, expectedTitle);
       
  }
  @BeforeTest
  public void beforeMethod() {
 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  
	 // WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
  System.out.println("Starting Test On Chrome Browser");
  
  
  }
  
@AfterTest
  public void afterMethod() {
	    
		 System.out.println("Finished Test On Chrome Browser");
		driver.quit();
		 
			
  }

}



*/


public class NewTest {
	 
    public static void main(String[] args) {
 
        String inputstring = "Krishna";
        char[] chars = inputstring.toCharArray();
        int length = chars.length;
         
        for (int i = length-1; i >=0; i--) {
            System.out.print(chars[i]);
             
        }
 
    }
}
 