package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Upload using autoIt, when no text box is available to provide the file path,
		// but the upload button opens up a new window from where user has to select the required file to upload.
		
		WebDriver d1;
		d1=new FirefoxDriver();
		d1.get("http://www.csm-testcenter.org/test?do=show&subdo=common&test=file_upload");
		
		d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

	}

}
