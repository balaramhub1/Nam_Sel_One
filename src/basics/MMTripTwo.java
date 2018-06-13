package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MMTripTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	WebDriver d1;
	d1=new FirefoxDriver();
	
	d1.get("https://www.emirates.com/in/English/");
		
	d1.findElement(By.xpath(".//*[@id='book']/a")).click();
	
	d1.findElement(By.id("Search for flights-link-label")).click();
	
	d1.findElement(By.id("ctl00_c_CtWNW_ltOneway")).click();
	
	
	
	
		

	}

}
