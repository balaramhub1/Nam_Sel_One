package wait.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d1=new FirefoxDriver();
		d1.get("http://www.calculator.net/");
		d1.findElement(By.xpath("//*[@id='hl1']/li[1]/a")).click();
		
		//year dropdown
		//will work if the element has a select tag.
		d1.findElement(By.id("cstartmonth")).click();
		
		
		

	}

}
