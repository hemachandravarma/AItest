package AISel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfAllElements 
{

	public static void main(String[] args) throws Exception
	{
		// Initialize Driver Object 
		WebDriver driver=new ChromeDriver();
		//Launch Site
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); //Maximize Browser 
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//*")); // here  //* any of the HTML Tags 
		System.out.println(l.size());
		//Close the browser
		driver.close();
	}
}
