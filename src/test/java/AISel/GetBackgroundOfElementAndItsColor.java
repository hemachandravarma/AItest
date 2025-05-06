package AISel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilities.Utilities;

public class GetBackgroundOfElementAndItsColor {

	
	public static void main(String[] args)
	{		
	  RemoteWebDriver driver = null;
	   Utilities.launchBrowser("Chrome");
	   Utilities.maximizeBrowser();  
	   Utilities.openSite("https://facebook.com");
	   driver.findElement(By.xpath(null));
	   
	   
	   Utilities.close();
	   
	}

}
