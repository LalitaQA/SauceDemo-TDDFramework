package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable04 {
	
	@Test(enabled =  false)
	public void add() {
		Reporter.log("add", true);
	}

	@Test(priority = -2)
	public void sub() {
		Reporter.log("sub", true);
	}

	@Test
	public void mul() {
		Reporter.log("mul", true);
	}

}
