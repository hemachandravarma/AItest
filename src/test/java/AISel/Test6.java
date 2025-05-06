package AISel;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a broeser name");
		String browsername=sc.nextLine();
		System.out.println("Enter a url");
		String url=sc.nextLine();;
		sc.close();
		
		RemoteWebDriver driver=null;
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Wrong Browsername");
		}
		
		
		//laun chsite
         String x= driver.getTitle();
        
		System.out.println(x);
	      
		driver.close();
	}

}
