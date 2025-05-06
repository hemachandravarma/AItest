package AISel;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test23 {
	public static void main(String args[]) throws Exception 
	{ 
//		//Get innings number and batter number from keyboard
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Innings number like 1 or 2");
//		int inum=sc.nextInt();
//		System.out.println("Enter batter number like 1 or 2 or ...etc upto 11");
//		int bnum=sc.nextInt();
//		sc.close();
//		//open browser
//		ChromeDriver driver=new ChromeDriver();
//		//Launch site
//		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/112462/ind-vs-aus-1st-semi-final-a1-v-b2-icc-champions-trophy-2025");
//		Thread.sleep(5000);
//		//Get runs of 1st bater in 1st innings
//		try{
//			WebElement e=driver.findElement(By.xpath("(//div[@id='innings_"+inum+"']/div[1]/descendant::div[contains(@class,'cb-scrd-itms')])["+bnum+"]/div[3]"));
//			String runs=e.getText();
//			driver.executeScript("arguments[0].style.border='5px yellow solid';",e); //Used JavaScript
//			System.out.printf("%d scored %s Runs in %d innings",bnum,runs,inum);
//		}
//		catch(NoSuchElementException ex){
//			System.out.println("No given innings or no given batter number found in page source");
//		}
//		//Close site
//		//driver.quit();
//		
//		  
		// get innings and batsmen name from the key board
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter match id");
		int mid=sc.nextInt();
		sc.nextLine();
;		System.out.println("Enter series ");
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

