package testcases;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basetest.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesFileUtility;
import genericUtility.WebDriverUtility;
import objectrepository.CartPage;
import objectrepository.LogInPage;
import objectrepository.ProductPage;

public class TC_03_UseDropDownFilterTest extends BaseClass {

	@Test(groups = "regression")
	public void UseDropDownFilterTest() throws InterruptedException {
		ExcelUtility eutil = new ExcelUtility();

		// Select dropdown value
		WebElement dropdown = driver.findElement(By.className("product_sort_container"));
		wdutil.select("Price (high to low)", dropdown);
		Thread.sleep(3000);

		// Add product
		ProductPage pp = new ProductPage(driver);
		CartPage cp = new CartPage(driver);
		pp.getProdname().click();
		pp.getAddtocartbutton().click();
		Thread.sleep(3000);

		// Open cart
		pp.getCarticon().click();
		Thread.sleep(3000);

		// Remove product
		cp.getRemovebutton().click();
		Thread.sleep(3000);

		// Continue shopping
		cp.getContinueshopbutton().click();
		Thread.sleep(3000);

	}

}
