package AISel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test19 {

	public static void main(String[] args) throws Exception{
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	driver.switchTo().frame("iframeResult"); //Switching to a frame
	driver.findElement(By.name("fname")).sendKeys("abdul");
	driver.findElement(By.id("lname")).sendKeys("kalam");
	driver.findElement(By.xpath("//input[@value=Submit']")).click(); //single quote missing
	Thread.sleep(5000);
	//this code will give you a InvalidSelectorException because our Xpath syntax is wrong
	}

}
