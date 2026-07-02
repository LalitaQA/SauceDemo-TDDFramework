package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement prodname;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	private WebElement prodname2;
	

	@FindBy(id="add-to-cart")
	private WebElement Addtocartbutton;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement Carticon;

	public WebElement getAddtocartbutton() {
		return Addtocartbutton;
	}

	public WebElement getCarticon() {
		return Carticon;
	}
	
	public WebElement getProdname2() {
		return prodname2;
	}

	public WebElement getProdname() {
		return prodname;
	}
	

}
