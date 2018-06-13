package basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d1;
		//System.setProperty("webdriver.chrome.driver", "D:\\Programming\\SeleniumJars\\chromedriver_win32.exe");
		
		d1=new FirefoxDriver();
		d1.get("http://www.dublin.k12.ca.us");
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.findElement(By.cssSelector("#navc-15>a>span")).click();
		
		
		
	}

}
