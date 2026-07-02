package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void add()
	{
		Reporter.log("add", true);
	}

	@Test
	public void sub()
	{
		Reporter.log("sub", true);
	}
	
	@Test
	public void mul()
	{
		Reporter.log("mul", true);
	}
}
