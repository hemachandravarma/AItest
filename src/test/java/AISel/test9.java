package AISel;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test9 {

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
		
		driver.get("http://facebook.com");
		
		String y=driver.getCurrentUrl();
		System.out.println(y);
		
		if(y.startsWith("https"))
		{
			System.out.println("valid Url");
		}else
		{
			System.out.println("in valid Url");
		}
		
		sc.close();
	}

	}
