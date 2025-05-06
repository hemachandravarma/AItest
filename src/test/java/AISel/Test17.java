package AISel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test17 {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("fname")).sendKeys("varma");
		driver.findElement(By.id("lname")).sendKeys("mode");
		driver.findElement(By.xpath("//input[@type='submit']"));
	
		//this program gives "no such element exception" because our elements are under a frame 
		
	}

}
