package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void demo() {
		String expectedTitle = "Facebook";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("step1");
		System.out.println("step2");

	}
}
