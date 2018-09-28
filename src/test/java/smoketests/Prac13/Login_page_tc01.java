package smoketests.Prac13;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.Login_page;
import utility.Browser;

public class Login_page_tc01 
{
@Test
	
	public void f() throws IOException
	{
		WebDriver driver = Browser.browser("chrome", "https://www.facebook.com");
		Login_page l = PageFactory.initElements(driver, Login_page.class);
		l.login_pagetest("Karthik", "Mynewpass");
	}
}
