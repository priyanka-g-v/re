package Assertion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

	public class Runner1 extends Genric_class
	{
		@Test
		public void rundata()
		{	
		WebElement ser = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		ser.sendKeys("Iphone");
		ser.sendKeys(Keys.ENTER);
			
		}
	
		@Test
		public void rundata1() throws IOException
		{
			  WebElement se = driver.findElement(By.xpath("//img[@class='DByuf4']"));
			  se.click(); 
		      String p_a = driver.getWindowHandle();

				Set<String> c_d = driver.getWindowHandles();
				ArrayList<String> a = new ArrayList<String>(c_d);
			    String c = a.get(1);
			    driver.switchTo().window(c);
			   
			 
			    WebElement ele2 = driver.findElement(By.xpath("//button[@class='QqFHMw cNEU5Q J9Kkbj _7Pd1Fp']"));
				Point locn = ele2.getLocation();
				System.out.println(locn);
				int fb1 = locn.getX();
				int fb2 = locn.getY();
		
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy("+fb1+","+fb2+")");
			
				
			
		}
	}


