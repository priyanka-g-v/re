package conceptsall;

import org.testng.Reporter;
import org.testng.annotations.Test;

//Based on Ascii value

/*public class priority
{
	@Test
     public void demo()
     {
		Reporter.log("india",true);
     }
	@Test
    public void abc()
    {
		Reporter.log("Asia",true);
    }
}*/



//Based on Priority

public class priority
{
	@Test(priority = 1)
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