package conceptsall;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation
{
	public class priority
	{
		@Test(enabled = false)
	     public void demo()
	     {
			Reporter.log("india",true);
	     }
		@Test
	    public void abc()
	    {
			Reporter.log("Asia",true);
	    }
	}

}
