package AISel;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 {

	public static void main(String[] args) throws Exception {
		
		//declare driver object 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter innings number like 1 and 2r");
		int innnum=sc.nextInt();
		System.out.println("Enter Bats men number");
		int Bnum=sc.nextInt();
		sc.close();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/115093/srh-vs-gt-19th-match-indian-premier-league-2025");
		//driver.get("https://www.cricbuzz.com/live-cricket-scorecard/"+x+"/gt-vs-pbks-5th-match-indian-premier-league-2025");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//div[@id='innings_"+innnum+"']/descendant::div[contains(@class,'cb-scrd-itms')])["+Bnum+"]/div[3]"));
		String runs=e.getText();
		System.out.println("Innnings "+innnum+" number "+Bnum+" Batsmen Scored "+runs);	
	}

}
