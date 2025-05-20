package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Utilities {
	private final RemoteWebDriver driver;

	public Utilities(RemoteWebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("WebDriver instance cannot be null");
		}
		this.driver = driver;
	}

	public static RemoteWebDriver launchBrowser(String browserName) {
		try {
			RemoteWebDriver driver;
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
			} else {
				throw new IllegalArgumentException("Invalid browser name: " + browserName);
			}
			return driver;
		} catch (Exception e) {
			throw new RuntimeException("Failed to launch browser: " + browserName, e);
		}
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void openSite(String url) {
		driver.get(url);
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public void quit() {
		driver.quit();
	}
}
