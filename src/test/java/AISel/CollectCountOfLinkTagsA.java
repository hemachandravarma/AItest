package AISel;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CollectCountOfLinkTagsA {

	public static void main(String[] args) throws Exception {
		
		// Get input from keyboard by using scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browsername"); 
		String x=sc.nextLine();
		System.out.println("Enter URL");
		String y=sc.nextLine();
		sc.close();
		//declare driver object
		RemoteWebDriver driver=null;
		
		if (x.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(x.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}else if(x.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();	
		}else
		{
			System.out.println("You have Entered a Wrong Browser name");
			
		}
		// launch browser 
		driver.get(y);
		driver.manage().window().maximize(); // MAximize the browser 
		Thread.sleep(2000);
		List<WebElement> l=driver.findElements(By.xpath("//a"));//find the links which are having <a> tag
		System.out.println(l.size());// store result in a list
		
	}

}
