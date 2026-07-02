package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo03 {

	@Test
	public void apple() {
		Reporter.log("apple", true);
	}

	@Test
	public void Mango() {
		Reporter.log("Mango", true);
	}

	@Test
	public void banana() {
		Reporter.log("banana", true);
	}

	@Test
	public void Orange() {
		Reporter.log("Orange", true);
	}

}
