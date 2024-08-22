package qsp1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class abc 
{
   @Test
   public void test1() throws InterruptedException
   {
	  
	   System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/hello.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='password']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL + "a");
    	ele.sendKeys(Keys.DELETE);

   }
   
   @Test
   public void test2() throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
  
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/User/Desktop/check.html");
	
	List<WebElement> links = driver.findElements(By.xpath("//input[@type='checkbox']"));
   int count = links.size();
   System.out.println(count);
 
   for(WebElement we:links)
   {
   	Thread.sleep(100);
   	we.click();
   }	    
   for(int i=count-1;i>=0;i--)
   {
   	WebElement x = links.get(i);
   	Thread.sleep(100);
   	x.click();
   	
   }
   }
}
