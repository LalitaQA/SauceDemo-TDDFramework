package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void demo() {
		String expectedTitle = "Facebook";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();

		SoftAssert soft= new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		System.out.println("step1");
		System.out.println("step2");
		soft.assertAll();
		driver.quit();
	}
}
