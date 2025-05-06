package AISel;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String browsername=sc.nextLine();
		
		RemoteWebDriver driver=null;
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}else
		{
			System.out.println("wrong browsername");
		}
		sc.close();
		//launch site by using i.1 get() Method
		driver.get("https://facebook.com");
		//get Current Url of the page by using getpageSource method
		String x=driver.getPageSource();
		System.out.println("Page source " +x);
		
		//close the browser
		//driver.close();
		
	}

}
