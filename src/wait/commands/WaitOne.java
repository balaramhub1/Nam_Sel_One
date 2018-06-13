package wait.commands;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class WaitOne {
  
	WebDriver d1;
	WebDriverWait w1;
	Wait<WebDriver> w2;
	
    @BeforeTest
	public void beforeTest() {
    	d1= new FirefoxDriver();
    	w1=new WebDriverWait(d1,20);
    	w2=new FluentWait<WebDriver>(d1)
    			.withTimeout(30, TimeUnit.SECONDS)
    			.pollingEvery(5, TimeUnit.SECONDS)
    			.ignoring(NoSuchElementException.class);
    	
    	d1.get("http://www.calculator.net/");
    	
    	// implicit wait
    	d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
	  }
	
	@Test(priority=1)
	public void Mortgage() {
		
		d1.findElement(By.xpath("//*[@id='hl1']/li[1]/a")).click();
		
		WebElement me=d1.findElement(By.id("chouseprice"));
		
		
		//Explicit wait with ExpectedCondition command
		w1.until(ExpectedConditions.visibilityOf(me));
		System.out.println("Month field displayed");
		me.sendKeys("1111");
		
			
  }
	@Test(priority=2)
	public void Autoloan(){
		
		d1.navigate().to("http://www.calculator.net/");
		
		d1.findElement(By.xpath("//*[@id='hl1']/li[3]/a")).click();
		d1.findElement(By.id("cloanamount")).clear();
		d1.findElement(By.id("cloanamount")).sendKeys("15000");
		
		
		//Fluent Wait.
		
		WebElement calbutton=w2.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver drv){
				System.out.println("Waiting for Calculator button");
				return drv.findElement(By.xpath("//*[@id='calinputtable']/tbody/tr[10]/td[1]/input[3]"));
			}
		});
		
		calbutton.click();
		
			
	}
	
	@AfterMethod
	public void Home() throws InterruptedException{
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id='logo']/a/img"));
		Thread.sleep(2000);
	}
  

  @AfterTest
  public void afterTest() {
	  d1.close();
	  d1.quit();
	  
  }

}
