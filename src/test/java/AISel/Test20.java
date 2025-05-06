package AISel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test20 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.name("fname")).sendKeys("abdul");
		driver.findElement(By.id("lname")).sendKeys("kalam");
		driver.findElement(By.xpath("//input[@value='submit']")).click(); //lower case "submit"
		Thread.sleep(5000);
		
		//we will get invalid selector exception due to invalid xpath here attribute value first letter is upper case
	}

}
