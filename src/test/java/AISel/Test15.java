package AISel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 
{
	public static void main(String args[]) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://aidaform.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		try 
		{
			driver.findElement(By.xpath("//div[@id='CybotCookiebotDialogFooter']/descendant::button[text()='Allow all']")).click();
		}
		catch(Exception e)
		{
			System.out.println("No coockie bnner On the page");
		}
		
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.findElement(By.name("nickname")).sendKeys("valmikiii");
		driver.findElement(By.name("email")).sendKeys("valmikiii@gmail.com");
		driver.findElement(By.name("password")).sendKeys("valmikiii@1990");
		driver.findElement(By.name("confirm")).sendKeys("valmikiii@1990");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);		
		
//		WebElement e=driver.findElement(By.xpath("//*[@id=\"app\"]/descendant::div[contains(text(),'Just a moment!')]"));	
//		Thread.sleep(5000);
//		String x=e.getText();
//		System.out.println(x);
//		System.out.println(driver.getCurrentUrl());
//		
		
		

		/*//Open Chrome browser
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//Launch google site
		driver.get("https://my.aidaform.com/signup");
		Thread.sleep(5000);
		//Fill fields with data
		driver.findElement(By.name("nickname")).sendKeys("batch270");
		driver.findElement(By.name("email")).sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("password")).sendKeys("Batch@270");
		driver.findElement(By.name("confirm")).sendKeys("Batch@270");
		driver.findElement(By.xpath("(//*[local-name()='svg'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Create My Free Account']")).click();
		*/
	}
}
