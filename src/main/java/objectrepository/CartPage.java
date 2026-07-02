package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement inventoryname;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	private WebElement inventoryname2;

	public WebElement getInventoryname2() {
		return inventoryname2;
	}

	public WebElement getInventoryname() {
		return inventoryname;
	}
	@FindBy(id = "react-burger-menu-btn")
	private WebElement Menuicon;

	@FindBy(id = "logout_sidebar_link")
	private WebElement Logout;

	@FindBy(id = "continue-shopping")
	private WebElement Continueshopbutton;

	@FindBy(id = "checkout")
	private WebElement Checkoutbutton;

	@FindBy(xpath = "//button[text()='Remove']")
	private WebElement Removebutton;

	@FindBy(className = "inventory_item_name")
	private WebElement Cartproducts;

	public WebElement getMenuicon() {
		return Menuicon;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getCartproducts() {
		return Cartproducts;
	}

	public WebElement getContinueshopbutton() {
		return Continueshopbutton;
	}

	public WebElement getCheckoutbutton() {
		return Checkoutbutton;
	}

	public WebElement getRemovebutton() {
		return Removebutton;
	}

}
