package basics;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MMTripOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d1;
		System.setProperty("webdriver.gecko.driver", "D:\\Programming\\SeleniumJars\\geckodriver.exe");
		d1=new FirefoxDriver();
		
		d1.get("https://www.makemytrip.com");
		
		d1.findElement(By.className("ch__makeBlock")).click();
		
		Thread.sleep(3000);
		
		Set<String> h1=d1.getWindowHandles();
		
		System.out.println(h1);
		
		System.out.println(h1.size());
			
		d1.switchTo().window(h1.iterator().next());
		
		for(String h:h1){
			d1.switchTo().window(h);
		}
		
		d1.quit();	
	}

}
