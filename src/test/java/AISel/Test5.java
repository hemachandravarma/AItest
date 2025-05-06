package AISel;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test5 {

	public static void main(String[] args) 
	
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Browsername");
	  String browsername=sc.nextLine();
	  System.out.println("Enter URL");
	  String url=sc.nextLine();
	  RemoteWebDriver driver=null;
	  
	  if(browsername.equalsIgnoreCase("Chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(browsername.equalsIgnoreCase("Edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  else if(browsername.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else
	  {
		  System.out.println("Wrong browser");
	  }
       
	  driver.get("Facebook url is"  + url);
	}

}
