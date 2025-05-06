package AISel;

import java.net.URL;

import org.openqa.selenium.edge.EdgeDriver;

public class Test13 {

	public static void main(String[] args) throws Exception 
	{

		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		
		
		URL obj=new URL("http://www.amazon.com");
		//String obj="http://www.amazon.com";
		driver.navigate().to(obj);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();

	}

}
