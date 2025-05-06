package AISel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ImagtagswithBorderDecoration {

	public static void main(String[] args) 
	{
		//initialize the driver object 
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximize the browser 
		driver.get("https://www.flipkart.in"); //launch site
		
		List<WebElement> l=driver.findElements(By.xpath("//img")); //store the image tags into a list 
		int index=0, vc=0, inv=0;
		for(WebElement w:l)
		{
			if(w.isDisplayed() && w.isEnabled())
			{
				//Mark the images with red dotted lines in the page like decoration
				driver.executeScript("arguments[0].style.border='10px ping solid';", w);
				index++;
				vc++;
				System.out.println(index+")."+ w.getDomAttribute("src"));
				//print the index along with the Dom Attribute value "src"
				
			}
			else
			{
				inv++;
			}
		}	
		System.out.println("Visible count " +vc);
		System.out.println("InVisible count " +inv);
		System.out.println("total Count " + l.size());
		driver.close();
		
	}

}
