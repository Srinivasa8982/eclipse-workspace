package navigation;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navfun {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
				 
		/* driver.findElement(By.xpath(".")).click();
		  ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs_windows.get(1));
		 
		
	
		String URL="http://www.facebook.com";
		
		driver.get(URL);
	//	 System.out.println(driver.getTitle());
		driver.navigate().to(URL);
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		
	*/	 
	    driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
	    driver.findElement(By.linkText("This is a link")).click();
	    driver.navigate().back();   
	    System.out.println(driver.getCurrentUrl());
	    //driver.wait(5000);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    System.out.println("moving forword");
	    driver.navigate().forward();  
	 //  driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
	    driver.navigate().refresh();
	    System.out.println("helloo");
	    
	}
	

}
