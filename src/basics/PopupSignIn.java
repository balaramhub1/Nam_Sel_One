package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopupSignIn {
  
	// go to linkedIn page, without prior signin.
	WebDriver d1;
  @BeforeTest
  public void beforeTest() {
	  d1=new FirefoxDriver();
	  d1.get("https://www.linkedin.com/");
	  d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
  
  @Test
  public void f() {
	  
	  d1.findElement(By.id("reg-firstname")).sendKeys("Ram");
  }

  @AfterTest
  public void afterTest() {
	  d1.close();
	  d1.quit();
  }

}
