package Login_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class Login_Page  extends BaseLibrary 
{
	
	public Login_Page()
	{
		PageFactory.initElements(driver,this);
	}
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		}
     @FindBy(xpath="//input[@name='name']")
     private WebElement name;
     @FindBy(xpath="//input[@name='email']")
     private WebElement email;
     @FindBy(xpath="//input[@name='phone']")
     private WebElement phone;
     @FindBy(xpath="//input[@type='file']")
     private WebElement selectfile;
     @FindBy(xpath="//textarea[@name='description']")
     private WebElement discription;
     @FindBy(xpath="//button[text()='APPLY NOW']")
     private WebElement applybtn;
     @FindBy(xpath="(//a[@href='/services'])[1]")
     private WebElement service;
   
	public void filldetails() throws InterruptedException
	{
		name.sendKeys("chitra");
		email.sendKeys("chitrasgupta@gmail.com");
		phone.sendKeys("6395729492");
		Thread.sleep(4000);
		selectfile.sendKeys(System.getProperty("user.dir")+"\\Demo_Project\\resume _file"); 
		discription.sendKeys("thanks");
		applybtn.click();
		
	}
	public void clickonMousehover()
	{
		mouse_hover(service);
	}
}
