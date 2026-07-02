package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority01 {

	@Test(priority = 2)
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
