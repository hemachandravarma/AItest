package AISel;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 {

	public static void main(String[] args) throws Exception
	{ 
		//initializing webdriver
		WebDriver driver=new ChromeDriver();
		//launch website
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		//waiting for 2 seconds 
		Thread.sleep(2000);
		//Switching to the frame
		driver.switchTo().frame("iframeResult");
		//locating the target elements and fill text boxes and clicking the buttons 
		driver.findElement(By.xpath("//*[contains(@id,'fname')]")).sendKeys("varma", Keys.ENTER );
		Thread.sleep(2000);
		driver.findElement(By.name("lname")).sendKeys("mode",Keys.ENTER);
		driver.findElement(By.xpath("//input[@typr='Submit']")).click();
		//close site 
		//driver.quit();
		
        //here there are two matching elements with "name" text for the name field and for the find element method 
		//SWD operate the first matching element by default
		//driver.close();
	} 

}
