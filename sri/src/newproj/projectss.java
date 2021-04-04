package newproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class projectss {

	public static void main(String[] args) throws Exception {
		
		
		// setting the system property 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		// creating the object for the webdriver
		 WebDriver driver = new ChromeDriver();
		 
		 //getting the URL by the method get
		driver.get("http://demowebshop.tricentis.com/");
		
		
		//locating the login by className
		driver.findElement(By.className("ico-login")).click();
		
		System.out.println("hi");
	/*	SearchContext ActualTitle = driver.findElement(By.cssSelector("#Welcome, Please Sign In!"));
		
		String ExpectedTitle = "Welcome, Please Sign In!";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		System.out.println("Text Found");
		*/
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Welcome, Please Sign In!"))
		{
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
	
	
	}
		System.out.println("Text Found");
		
		driver.findElement(By.className("email")).sendKeys("testdemowebshop@gmail.com");
		driver.findElement(By.className("password")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		if(driver.getPageSource().contains("Welcome, Please Sign In!"))
		{
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
	
	
	}
}
	
	
}