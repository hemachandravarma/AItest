package AISel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalSelectExcep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//open browser
				ChromeDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://www.cricbuzz.com/live-cricket-scorecard/112462/ind-vs-aus-1st-semi-final-a1-v-b2-icc-champions-trophy-2025");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//Find elements, which have "Sachin" as text
				List<WebElement> pl=driver.findElements(By.xpath("//*[text()='Sachin]"));
				System.out.println(pl.size());
				//Close site
				driver.quit();

	}

}
