package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import utility.Screenshot;

public class Login_page 
{
	public WebDriver driver;
	public Login_page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy (how = How.ID, using = "username")
	@CacheLookup WebElement uname;
	
	@FindBy (how = How.ID, using = "password")
	@CacheLookup WebElement pword;
	
	public void login_pagetest(String un, String pw) throws IOException
	{
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(uname.isDisplayed(), "username NOT displayed");
		Reporter.log("user name displayed", true);
		
		sa.assertTrue(uname.isEnabled(), "un is NOT enabled");
		Reporter.log("username selected", true);
		
		sa.assertTrue(uname.isSelected(), "un is NOT selected");
		Reporter.log("username selected", true);
		
		uname.sendKeys(un);
		Screenshot.capturescreenshot(driver, "username entered");
		
		pword.sendKeys(pw);
		Screenshot.capturescreenshot(driver, "password entered");
	}
}
