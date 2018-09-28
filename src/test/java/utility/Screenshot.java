package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public static void capturescreenshot(WebDriver driver, String nameofscreenshot) throws IOException
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File (".//screenshot/"+nameofscreenshot+".png"));
		
		System.out.println(nameofscreenshot+ "captured successfully");
		}
		catch(ArithmeticException e)
		{
			System.out.println("screen shot NOT captured becos "+e.getMessage());
		}
		
	}
}
