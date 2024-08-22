package assign;


import org.testng.annotations.Test;

public class runner extends genric
{
	@Test
	public void pom() throws InterruptedException
	{
          
		 pom p = new pom(driver);
		 p.passData("dcszfdf");
	
		 Thread.sleep(1000);
		 
		 driver.navigate().refresh();
		 
		 Thread.sleep(1000);
		 p.passData1("zssd@123");
		 Thread.sleep(1000);
		 
		 driver.navigate().refresh();
		 
		 p.passData("SaDsd");
		 p.passData1("sds@123");
		 p.passData2();
		 
	     
	}

}
