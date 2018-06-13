package wait.commands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class dublinWaitOne {
	
	WebDriver d1;
  
  @BeforeTest
  public void beforeTest() {
	  d1=new FirefoxDriver();
	  d1.get("http://www.dublin.k12.ca.us/");
  	d1.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
  }
  
  @Test
  public void f() {
	  
	  System.out.println("Waiting function....");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
