package AISel;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test3 {

			public static void main(String[] args) throws Exception
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter browser name");
				String browsername=sc.nextLine();
				sc.close();
				RemoteWebDriver driver=null;
		          
		        if (browsername.equalsIgnoreCase("chrome")) 
		        {
		        	driver=new ChromeDriver();
		        }
		        else if(browsername.equalsIgnoreCase("edge"))
		        {
		        	driver=new EdgeDriver();
		        }
		        else if (browsername.equalsIgnoreCase("firefox"))
		        {
		        	driver=new FirefoxDriver();
		        }
		        else 
		        {
		        	System.out.println("invalid browsername");   //print error and stop
		        }
			/*//open browser
				driver.get("https://google.com");
				driver.manage().window().maximize();
			// click on banner element 	
				Thread.sleep(5000);
			 
			//enter text to the search field 	
				driver.findElement(By.xpath("//*[@name='q']")).sendKeys("fb", Keys.ENTER);
				String x=driver.getTitle(); 
				System.out.println(x);
				//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("helmet", Keys.ENTER);*/
			}

	}
