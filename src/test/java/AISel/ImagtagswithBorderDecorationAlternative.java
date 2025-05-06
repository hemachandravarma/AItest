package AISel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ImagtagswithBorderDecorationAlternative {

	public static void main(String[] args)throws Exception {
		//initialize driver object
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com");
		
		List<WebElement> AllImages=driver.findElements(By.xpath("//img"));
		
		List<WebElement> vimg=new ArrayList<WebElement>();
		int count=0, ivc=0,index=0;
		for(WebElement image:AllImages)
		{
			if(image.isDisplayed())
			{
				count++;
				vimg.add(image);
				index++;
				System.out.println(index+")."+image.getDomAttribute("src"));
			}
			else
			{
				ivc++;
			}
		}
		
		for(WebElement img:vimg)
		{
			driver.executeScript("arguments[0].style.border='10px Green solid';", img);
			//Thread.sleep(5000); // wait for 5 seconds for each image highlight 
		}
		
		System.out.println("visible images count is " +count);
		System.out.println("Invisible images count is " +ivc);
		System.out.println("Total images count is " +AllImages.size());
		Thread.sleep(5000);	
		driver.close();
	}
	
}
