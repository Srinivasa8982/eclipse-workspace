package selectingmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectexample2 {

	
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	WebElement developers_dropdown = driver.findElement(By.className("nav_item_name"));
	Select objSelect = new Select(developers_dropdown);
	objSelect.selectByIndex(2);
	Thread.sleep(3000);
	driver.get("https://www.browserstack.com/");
	WebElement solutions_dropdown = driver.findElement(By.id("solutions-menu-dropdown"));
	Select solutions = new Select(solutions_dropdown);
	solutions.selectByValue("4000");
	Thread.sleep(3000);
	WebElement solutions_d = driver.findElement(By.id("solutions-menu-dropdown"));
	Select s1 = new Select(solutions_d);
	s1.selectByVisibleText("Geolocation Testing");
}

	
	
}
