package demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoweb {
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
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Your Shopping Cart is empty!"))
		{
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
					
	}
	
		
//		driver.findElement(By.className("Books\r\n")).click();
		
	/*	driver.findElement(By.linkText("http://demowebshop.tricentis.com/content/images/thumbs/0000130_computing-and-internet_125.jpeg")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("http://demowebshop.tricentis.com/content/images/thumbs/0000209_copy-of-computing-and-internet-ex_125.jpeg")).click();
		
		*/
		
}
	
	
	
	

}
