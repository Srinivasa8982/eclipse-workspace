package sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.edureka.co/");
		
		driver.findElement(By.linkText("Log In")).click();
		
		driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).sendKeys("gsrkc24101992@gmail.com");

		
		
		driver.findElement(By.xpath("//*[@id=\"si_popup_passwd\"]")).sendKeys("92475179199247517919");
	
		
		
		driver.findElement(By.xpath("//*[@id=\"new_sign_up_optim\"]/div/div/div[2]/div[3]/form/button")).click();
		
		
	   // driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/a/span[1]")).click();
		
		driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/a")).click();
		
		Thread.sleep(50000);
		
		driver.close();
	/*	
        System.out.println("hi this is my first prog");

        File file =    new File(filePath+"\\"+fileName);
        
        FileInputStream inputStream = new FileInputStream(file);

*/
        
        
        
	}

}
