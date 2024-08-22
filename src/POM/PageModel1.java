package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageModel1
{
	//Declaration
	@FindBy(id="email")
	private WebElement uname;
	
     //Initialization
	public PageModel1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public void passData(String un)
	{
	    uname.sendKeys(un);
	    
	}	
	
	@FindBy(id="pass")
	private WebElement pname;
	
	public void passData1(String pwd)
	{
	   pname.sendKeys(pwd);
	    
	}	
	
	@FindBy(name="login")
	private WebElement loginn;
	
	
	
	
	
}

