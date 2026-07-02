package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basetest.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesFileUtility;
import genericUtility.WebDriverUtility;
import objectrepository.CartPage;
import objectrepository.LogInPage;
import objectrepository.ProductPage;

@Listeners(ListenersUtility.ListenersImplementation.class)

public class TC_01_AddProductToCartTest extends BaseClass {
	

	@Test(groups = "regression")
	public void AddProductToCartTest() throws IOException, Throwable {

		ExcelUtility eutil = new ExcelUtility();

		String prodName1 = eutil.toReadDataFromExcel("Products", 1, 2);

		// add product in cart
		ProductPage pp = new ProductPage(driver);
		CartPage cp = new CartPage(driver);
		pp.getProdname().click();
		pp.getAddtocartbutton().click();
		Thread.sleep(2000);

		// navigate to cart
		pp.getCarticon().click();

		// validation
		String prodInCart = cp.getInventoryname().getText();

		Assert.assertEquals(prodInCart, prodName1);
	}

}
