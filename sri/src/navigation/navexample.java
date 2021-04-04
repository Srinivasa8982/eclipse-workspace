package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class navexample {

	
	

 
    WebDriver driver;
     String URL1 = "http://www.yahoo.com";
     String URL2 = "http://www.amazon.com";
 
    @BeforeClass
    public void setupTest(){
        driver = new ChromeDriver();
    }
 
    //.get Example
    @Test
    public void T01_getURLExample() {
        //Go to www.yahoo.com
        driver.get(URL1);
 
        //Check title is correct
        Assert.assertEquals(driver.getTitle(), "Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment");
    }
 
    //.Navigate().to example
    @Test
    public void T02_navigateToExample(){
        //Go to www.amazon.com
        driver.navigate().to(URL2);
 
        //Check title is correct
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }
 
    @Test
    //Back - Forward - Refresh Example
    public void T03_backForwardRefreshExample(){
       //Go to www.yahoo.com
        driver.navigate().to(URL1);
        //Check title is correct
        Assert.assertEquals(driver.getTitle(), "Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment");
 
        //Go to www.amazon.com
        driver.navigate().to(URL2);
        //Check title is correct
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
 
        //***Navigate Back***
        driver.navigate().back();
        //Check title is correct
        Assert.assertEquals(driver.getTitle(), "Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment");
        System.out.println("hi");
        
        //***Navigate Forward***
        driver.navigate().forward();
        //Check title is correct
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        System.out.println("helloo");
        //***Refresh The Page***
        driver.navigate().refresh();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    
        System.out.println("h r u");
        
       
    }
 
    @AfterClass
    public void quitDriver(){
        driver.quit();
    }
}

