package selectors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d1;
		d1=new FirefoxDriver();
		d1.get("https://fly4.emirates.com/CAB/IBE/SearchAvailability.aspx");
		
		d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		d1.findElement(By.id("txtDepartDate")).click();
		
		

	}

}
