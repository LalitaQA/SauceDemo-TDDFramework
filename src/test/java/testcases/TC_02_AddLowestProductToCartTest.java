package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesFileUtility;
import genericUtility.WebDriverUtility;
import objectrepository.CartPage;
import objectrepository.LogInPage;
import objectrepository.ProductPage;

public class TC_02_AddLowestProductToCartTest extends BaseClass {

	@Test(groups = "smoke")
	public void AddLowestProductToCartTest() throws IOException, Throwable {
		ExcelUtility eutil = new ExcelUtility();

		String prodName1 = eutil.toReadDataFromExcel("Products", 4, 3);

		// add product in cart
		ProductPage pp = new ProductPage(driver);
		CartPage cp = new CartPage(driver);
		pp.getProdname2().click();
		pp.getAddtocartbutton().click();
		Thread.sleep(2000);

		// navigate to cart
		pp.getCarticon().click();
		Thread.sleep(2000);

		// validation
		String prodInCart = cp.getInventoryname2().getText();

		Assert.assertEquals(prodInCart, prodName1);

	}

}
