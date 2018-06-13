package testNgOne;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AnnotationsOne {
	WebDriver d1;
	
	@BeforeTest
	  public void beforeTest() {
			
		d1=new FirefoxDriver();
		d1.get("https://www.emirates.com/in/English/");
	  }

  @Test(priority=2)
  public void testOne() {
	  
	  	/*d1.findElement(By.xpath(".//*[@id='book']/a")).click();
		
		d1.findElement(By.id("Search for flights-link-label")).click();
		
		d1.findElement(By.id("ctl00_c_CtWNW_ltOneway")).click();*/
	  
	  System.out.println("Executing method testOne()..");
  }
  
  @Test(priority=1)
  public void testTwo() {
	  
	  			
		 System.out.println("Executing method testTwo()..");
  }
  
  @Test(priority=3)
  public void testThree() {
	  
	  		
		 System.out.println("Executing method testThree()..");
  }
  
  @BeforeMethod
  public void bM(){
	  System.out.println("To be executed BEFORE every Test !!!!");
  }
  
  
  @AfterMethod
  public void aM(){
	  System.out.println("To be executed AFTER every Test !!!!");
  }
  
  
  

  @AfterTest
  public void afterTest() {
	  
	  d1.close();
	  d1.quit();
  }

}
