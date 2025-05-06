package AISel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test12 {

	public static void main(String[] args) {
		//creating object to driver class
		
		FirefoxDriver driver=new FirefoxDriver();
		//maximize the window 
		driver.manage().window().maximize();
		//launch the site
		driver.get("https://www.w3schools.com/html/html_intro.asp");
		//locate the element 
		driver.findElement(By.linkText("Try it Yourself »")).click();
		//get the results into set 
		Set<String> Windows =driver.getWindowHandles();
		//to get the required window id get the set into List and then get the new window/2nd window id 
		List<String> whs=new ArrayList<String>(Windows);
		//Switching to the 2nd window
		driver.switchTo().window(whs.get(1));
		
		// close the window 
		//driver.close();
	
		
		
		
		
		
		

	}

}
