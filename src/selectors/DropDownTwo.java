package selectors;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownTwo {
	
	// bootstrap dropdown
	WebDriver d1;
  
  @BeforeTest
  public void beforeTest() {
	  d1=new FirefoxDriver();
	  d1.get("https://book2.spicejet.com/");
	  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test
  public void f() {
	  d1.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	  List<WebElement> srcCity =d1.findElements(By.xpath("//*[@id='citydropdown']/tbody/tr[2]/td[2]/div[3]/div[1]/div[1]/ul/li/a"));
	  
	  for(WebElement el :srcCity){
		System.out.println(el.getAttribute("text").toString());  
	  }
	  
  }

  @AfterTest
  public void afterTest() {
	  d1.close();
	  d1.quit();
  }

}
