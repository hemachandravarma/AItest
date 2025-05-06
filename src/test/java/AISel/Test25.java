package AISel;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test25 {

	public static void main(String[] args) throws Exception {
		
		//open chrome Browser
		RemoteWebDriver driver=new ChromeDriver();
		//launch site 
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		//login using user name and password 
		driver.findElement(By.id("login-username")).sendKeys("varma199422@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Varma@1994");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("ybarMailLink")).click();
		
		Set<String> mail=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(mail);
		driver.switchTo().window(l.get(1));
		//Compose a mail from yahoo to gmail
		driver.findElement(By.linkText("Compose")).click();
		driver.findElement(By.id("message-to-field")).sendKeys("varma19942212@gmail.com");
		driver.findElement(By.id("compose-subject-input")).sendKeys("Test Automtion for mail communication");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("HI Varma"
				+ "This is the mail i am sending to test the mail communication between you and your inner beast");
		//attach file 
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\PSN Class\\Selenium Java Notes Part-1");
		Thread.sleep(10000);//wait for file upload 
		driver.findElement(By.xpath("//button[@title='Send this email']")).click(); //click on send button
		Thread.sleep(10000);
		
	    String successmessage=driver.findElement(By.xpath("//div[@role='presentation']/following-sibling::div[1]")).getText();
		//get the success or fail message for the sent mail 
		System.out.println(successmessage);
	  //create new Browser window 
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> t=driver.getWindowHandles();
		List<String> nt=new ArrayList<String>(t);
		driver.switchTo().window(nt.get(0));
		
		//launch the Gmail site 
		driver.get("https://accounts.google.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("varma19942212@gmail.com");
		driver.findElement(By.linkText("//div[@id=\"identifierNext\"]/descendant::button[@type='button']")).click();
		driver.findElement(By.name("Passwd")).sendKeys("Sml@1990");
		driver.findElement(By.xpath("//div[@id=\"passwordNext\"]/descendant::button[@type='button']")).click();
		
		//test Case1:
		String x=driver.findElement(By.xpath("(//div[@class='UI']/descendant::tr[contains(@role,'row')]/td[4])[1]")).getDomAttribute("title");
		
		if(x.equals("varma199422@yahoo.com"))
		{
			System.out.println("From Address Test case passed");
		}
		else			
		{
			System.out.println("from Address test case failed");
		}
		//Test Case 2: Find the mails subject
//		try {
//			
////			
////		}catch(Exception e)
////		{
////			
////		}
//		}	
	}
}
