package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TPS03 {
	
	@Test(invocationCount = 10,threadPoolSize = 3)
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
	}

}
