package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nav2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("http://www.filehippo.com");
		 
		 
		 driver.findElement(By.linkText("Browsers")).click();
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();

	}

}
