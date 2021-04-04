import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  
	WebDriver driver ;
	 @Test
	 public void f() {
	   
	     String baseUrl = "https://www.toolsqa.com/";
	       
	          
	         System.out.println("Launching Google Chrome browser"); 
	         driver = new ChromeDriver();
	         driver.get(baseUrl);
	         String testTitle = "Free QA Automation Tools For Everyone";
	         String originalTitle = driver.getTitle();
	         Assert.assertEquals(originalTitle, testTitle);
	  }
	 
	 @BeforeMethod
	 public void beforeMethod() {
	 System.out.println("Starting Test On Chrome Browser");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
	 driver.close();
	 System.out.println("Finished Test On Chrome Browser");
	 }
	}