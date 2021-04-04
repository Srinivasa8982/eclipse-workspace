package switching;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class switchfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 // Open ToolsQA web site
			 
		 String appUrl = "http://www.qaclickacademy.com/";
		 driver.get(appUrl);
		 
		// int size = driver.findElements(By.tagName("iframe")).size();
		 
		 //System.out.println("Total Frames --" + size);

		    String tabs_windows = driver.getWindowHandles();
		   
		 
		 driver.switchTo().window(tabs_windows);
		 List <WebElement> framesList = driver.findElements(By.xpath("//iframe"));
		 int numOfFrames = framesList.size();
		 
		 System.out.println("Total Frames --" + numOfFrames);
		System.out.println(driver.getTitle());

	}

}
