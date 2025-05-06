package AISel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class CollectCountOfImgTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		List<WebElement> l=driver.findElements(By.xpath("//img"));
		
		System.out.println(l.size());
		
		driver.close();

	}

}
