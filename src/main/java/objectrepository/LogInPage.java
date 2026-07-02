package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindAll({@FindBy(name = "user-name"), @FindBy(id = "user-name")})//autohealing
	private WebElement User;

	@FindBy(id = "password")
	private WebElement Pwd;

	@FindBy(id = "login-button")
	private WebElement Loginbutton;

	public WebElement getUser() {
		return User;
	}

	public WebElement getPwd() {
		return Pwd;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

}
