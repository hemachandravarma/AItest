package AISel;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 {
	public static void main(String args[])throws Exception
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter match id");
	int mid=sc.nextInt();
	sc.nextLine();	
	System.out.println("Enter series ");
	String ms=sc.nextLine();
	System.out.println("Enter innings number");
	int inn=sc.nextInt();
	System.out.println("Enter batsmen number");
	int bn=sc.nextInt();
	sc.close();
	//Declare driver object 
	ChromeDriver driver=new ChromeDriver();
	//launch site
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/"+mid+"/"+ms+"");
	
	//112462/ind-vs-aus-1st-semi-final-a1-v-b2-icc-champions-trophy-2025
	Thread.sleep(2000);
	try
	{
	WebElement e=driver.findElement(By.xpath("//div[@id='innings_"+inn+"']/descendant::div[contains(@class,'cb-scrd-itms')]["+bn+"]/div[3]"));
	String runs=e.getText();
	driver.executeScript("arguments[0].style.border='5px Red dotted';",e );
	System.out.printf("%d scored in %s runs in %d innings",inn,runs,bn);
	}
	catch(NoSuchElementException e)
	{
		System.out.println("No given innings and no given batsmen number found");
	}

	}
}
