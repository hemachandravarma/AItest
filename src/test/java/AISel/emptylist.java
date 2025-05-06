package AISel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class emptylist {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/112462/ind-vs-aus-1st-semi-final-a1-v-b2-icc-champions-trophy-2025");
		Thread.sleep(2000);
		List<WebElement> x=driver.findElements(By.xpath("//*[text()='Sachin']"));
		System.out.println(x.size());
		
        //returns 0 because no element Matching in the page source 
	}

}
