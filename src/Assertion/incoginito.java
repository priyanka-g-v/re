package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incoginito
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("..incognito");
		WebDriver driver = new ChromeDriver(opt);
		
	}

}
