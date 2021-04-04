package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.amazon.com");
		Actions a=new Actions(driver);
		WebElement wb=driver.findElement(By.cssSelector("#nav-link-accountList"));
		a.moveToElement(wb).build().perform();
		 
        a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	a.
	}

}
