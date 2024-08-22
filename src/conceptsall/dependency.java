package conceptsall;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependency
{
	public class priority
	{
		@Test
	     public void compose()
	     {
			Reporter.log("mail composed",true);
	     }
		
		@Test(dependsOnMethods = "compose")
	    public void sent()
	    {
			Reporter.log("mail sent",true);
			Assert.fail();
	    }
		
		@Test(dependsOnMethods = "sent")
	    public void trash()
	    {
			Reporter.log("mail deleted",true);
	    }
	}
	

}
