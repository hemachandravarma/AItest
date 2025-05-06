package AISel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws Exception
	{
		//initializing driver object 
		ChromeDriver driver=new ChromeDriver();
		//launch the site 
		driver.get("https://www.w3schools.com/html/html_intro.asp");
		Thread.sleep(2000);
		//finding an element in a page source
		WebElement x=driver.findElement(By.linkText("Try it Yourself »"));
		x.click();		
		
		// storing the unique browser windows id's in set of String because the browser windows id's are unique.
		//so we are using Set Interface, Set interface does not allow the duplicate values, and the set interface
		//concrete class is HashSet
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
	}

}
