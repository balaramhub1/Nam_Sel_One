package selectors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver d1;

	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.gecko.driver", "D:\\Programming\\SeleniumJars\\geckodriver.exe");
		d1=new FirefoxDriver();
		d1.get("http://www.calculator.net/");
		
	}
	
	@Test
	public void mortgage() throws InterruptedException{
		
		d1.findElement(By.xpath("//*[@id='hl1']/li[1]/a")).click();
		
		//year dropdown
		//will work if the element has a select tag.
		Thread.sleep(3000);
		WebElement YearSelect=d1.findElement(By.id("cstartmonth"));
		Select sel1=new Select(YearSelect);
		sel1.selectByVisibleText("Mar");
		//Similar can be used for multiselect.
		
		List<WebElement> mList=sel1.getOptions();
		for(WebElement x:mList){
			System.out.println("Values are : "+x.getAttribute("text").toString());
		}
		
	}
		
		
	@AfterTest
	public void endTest(){
		d1.quit();
	}
		
		
		

}
