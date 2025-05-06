package AISel;
import org.openqa.selenium.edge.EdgeDriver;

public class Test10 {

	public static void main(String[] args) {
		
		//declaring driver object 
		EdgeDriver driver=new EdgeDriver();
		//launch site
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//getting windows information
		String windows=driver.getWindowHandle(); //get window handles takes no arguments and return type is String
		System.out.println(windows);
		// close the driver
		//driver.close();
		
		

	}

}
