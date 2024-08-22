package conceptsall;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multipletimes 
{
	public class multiple
	{
		@Test(invocationCount = 4)
	     public void demo()
	     {
			Reporter.log("india",true);
	     }
		@Test(priority = 1)
	    public void abc()
	    {
			Reporter.log("Asia",true);
	    }
	}

}
