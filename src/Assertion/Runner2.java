package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Runner2 extends Runner1
{
	@Test
	public void rundata1()
	{	
	WebElement ser = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	ser.sendKeys("Iphone");
	ser.sendKeys(Keys.ENTER);
	}
	}
