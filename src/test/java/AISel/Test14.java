package AISel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		// launch site 
		driver.get("https://google.co.in");
		//Creating object to by class
		By obj=By.name("q");
		//sending by class as object to find element method 
		driver.findElement(obj).sendKeys("youtube", Keys.ENTER);
		String x=driver.getTitle();
		System.out.println(x);
	}

}
