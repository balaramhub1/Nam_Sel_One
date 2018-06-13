package basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d1;
		d1=new FirefoxDriver();
		d1.get("http://www.w3schools.com");
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.findElement(By.id("navbtn_tutorials")).click();
		d1.findElement(By.xpath("html/body/ul/li[5]/a")).click();
		d1.findElement(By.id("gsc-i-id1")).sendKeys("");
		d1.findElement(By.linkText("Learn HTML")).click();
		d1.findElement(By.className("w3schools-logo")).click();

	}

}
