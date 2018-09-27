package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser 
	{
		public static WebDriver driver;
		public static WebDriver browser(String browsername, String url)
		{
			if (browsername.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "E://selenium new//chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.get(url);
			return driver;
			
		}
	}
