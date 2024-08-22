package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Runnerclass 
{
	@Test
	public void PageModel1() throws InterruptedException
	{

		 System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 PageModel1  p = new PageModel1(driver);
		 p.passData("dcszfdf");
	
		 Thread.sleep(1000);
		 
		 driver.navigate().refresh();
		 
		 Thread.sleep(1000);
		 
		 p.passData("SaDsd");
		 p.passData1("sds@123");
	 		     
	}

}
