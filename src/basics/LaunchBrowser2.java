package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d1;
		d1=new FirefoxDriver();
		d1.get("https://www.makemytrip.com/");
		

	}

}
