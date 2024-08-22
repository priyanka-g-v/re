package assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom
{
	//Declaration
	@FindBy(id="email")
	private WebElement uname;
	
     //Initialization
	public pom(WebDriver driver)
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
	
	public void passData2()
	{
	  loginn.click();
	    
	}

	
	
}

