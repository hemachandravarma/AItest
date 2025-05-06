package utilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Utilities {
	
	private static RemoteWebDriver driver;  //declare RemotewebDriver instance
	
	public static void launchBrowser(String browsername)
	{
		try {
			if(browsername.equalsIgnoreCase("Chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("Edge"))
			{
				driver=new EdgeDriver();
			}
			else if(browsername.equalsIgnoreCase("safari"))
			{
				driver=new SafariDriver();
			}
			else
			{
				System.out.println("Invalid Browser name Entered" +browsername);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void maximizeBrowser()
	{
		driver.manage().window().maximize(); // maximize the browser
	}
	
	public static void openSite(String URL)
	{ 
		driver.get(URL); // launch browser 
	} 
	
	public String getTitle() 
	{
		return driver.getTitle();	 // get the title of the page 
	}
	public String getPageSource()
	{
		return driver.getPageSource(); // get page source 
	}
	public String getCurrentUrl()
	{ 
		return driver.getCurrentUrl();	 //get current url 
	}
	public String windoeHandle()
	{
		return driver.getWindowHandle(); // window handles 
	}
	public Set<String> windowHandles()
	{
		return driver.getWindowHandles(); // window handles multiple
	}
	
	public WebElement findElement(By locator)
	{
		return driver.findElement(locator);//Locate element in page source 
	}
	public List<WebElement> findElements(By locator)
	{
		return driver.findElements(locator); //Locate elements in page source
	}
	public static void close()
	{
		driver.close(); // Close current browser Window/tab
	}
	
	public static void quit() 
	{
		driver.quit();  // Close all browser window/Tab
	} 
}
