package AISel;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test8 {

	public static void main(String[] args) {

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
		
		driver.get("https://facebook.com");// takes arguments as string and return void
		 
		String y=driver.getCurrentUrl();   // it takes no arguments and return type is string
		System.out.println("the current url is" + y);
		
		sc.close();  // No argument and no return type used to close the current browser window/ tab
		
	}

}
