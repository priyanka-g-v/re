package devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner 
{
	@Test
	public void compose()
	{
		System.out.println("message composed");
	}

	
	@Test
	public void sent() 
	{
		System.out.println("message sent");
		Assert.fail();
	}

	@Test
	public void trash() 
	{
		System.out.println("message deleted");
	}

}
