package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo02 {

	@Test
	public void amazon() {
		Reporter.log("amazon", true);
	}

	@Test
	public void baskin() {
		Reporter.log("baskin", true);
	}

	@Test
	public void cricbuz() {
		Reporter.log("cricbuz", true);
	}

	@Test
	public void bigbaskt() {
		Reporter.log("bigbaskt", true);
	}

}
