package AISel;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfIamgesWithDom {

	public static void main(String[] args) 
	{
		//initialize web driver
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.flipkart.com");
		//get the image tags into a list 
		List<WebElement> l=driver.findElements(By.xpath("//img"));
		
		int index=0, vcount=0, invCount=0;
	    //print the image tags based on SRC attribute 
		for (WebElement image: l)
			
			if(image.isDisplayed() && image.isEnabled())
			{
				index++;
				vcount++;
				System.out.println(index+"). "+image.getDomAttribute("src"));
			
			}else 
			{
				invCount++;
			}	
		//Total count of img tags 
		System.out.println("Visible count is "+vcount);
		System.out.println("invisible count is "+invCount);
		System.out.println("Total count is " +l.size());
	}

}
