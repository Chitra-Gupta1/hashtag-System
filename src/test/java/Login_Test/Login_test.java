package Login_Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import Login_Page.Login_Page;
import baseLibrary.BaseLibrary;


public class Login_test  extends BaseLibrary
{
	Login_Page ob;
	
	@BeforeTest
	public void getlaunchUrl_fbtest()
	{
		getlaunchUrl();
		ob= new Login_Page();
	}
	@Test(priority=1)
	public void verify_getTitle()
	{
		ob.getTitle();
	}
	@Test(priority=2)
	public void verify_filldetails() throws InterruptedException
	{
		ob.filldetails();
	}
	@Test(priority=3)
	public void clickon_Mousehover()
	{
		ob.clickonMousehover();
	}
}
