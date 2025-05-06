package AISel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VisibleCounofImgTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//get the image links into list
		List<WebElement> l=driver.findElements(By.xpath("//img"));
		int vc=0, hc=0;
		//verify the visible count and invisible image  count 
		for (WebElement image:l)
		{
			if(image.isDisplayed())
			{
				vc++; //Increase by one
			}else
			{
				hc++;
			}
		}
		System.out.println(l.size());
		System.out.println("Visibl images count is  " + vc);
		System.out.println("Hidden Images Count is " +hc);

	}

}
