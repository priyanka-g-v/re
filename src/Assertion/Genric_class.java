package Assertion;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genric_class
{
   public WebDriver driver;
   @BeforeMethod
   public void openappln()
   {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
   }
   
   @AfterMethod
   public void closeAppl()
   {
	   driver.close();
   }

}
