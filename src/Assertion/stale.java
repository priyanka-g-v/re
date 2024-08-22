package Assertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class stale 
{

	public class Runner extends Genric_class
	{
		@Test
		public void rundata()
		{
			 WebElement ele1 = driver.findElement(By.id("email"));
			 ele1.sendKeys("admin");
			
			 driver.navigate().refresh();
			
			 ele1.sendKeys("admin");
		}
	}
}

