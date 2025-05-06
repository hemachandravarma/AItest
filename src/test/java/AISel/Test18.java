package AISel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {

	public static void main(String[] args) 
	{
		//Initialize the driver Object 
		ChromeDriver driver=new ChromeDriver();
		//launch site 
		driver.get("chrome://settings/");
		//Locate the element and fill the text field
		driver.findElement(By.id("searchInput")).sendKeys("chrmoe");
		
		//will receive no such element exception because the element under shadow root

	}

}
