package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import genericUtility.PropertiesFileUtility;
import genericUtility.WebDriverUtility;
import objectrepository.CartPage;
import objectrepository.LogInPage;

public class BaseClass {

	public WebDriver driver = null;
	public static WebDriver sdriver = null;
	public PropertiesFileUtility putil = new PropertiesFileUtility();
	public WebDriverUtility wdutil = new WebDriverUtility();

	@BeforeSuite(groups = {"smoke", "regression"})
	public void beforeSuite() {
		Reporter.log("DB open", true);
	}

	@BeforeClass(groups = {"smoke", "regression"})
	@Parameters("BROWSER")
	public void beforeClass() throws Throwable {
		//String BROWSER = putil.toReadDataFromPropertiesFile("Browser");
		String BROWSER = System.getProperty("Browser");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		sdriver=driver;
		Reporter.log("launch browser", true);
	}

	@BeforeMethod(groups = {"smoke", "regression"})
	public void beforeMethod() throws Throwable {
		String URL = putil.toReadDataFromPropertiesFile("Url");
		String USERNAME = putil.toReadDataFromPropertiesFile("Username");
		String PASSWORD = putil.toReadDataFromPropertiesFile("Password");

		wdutil.browserMaximize(driver);
		wdutil.waitForPageToLoad(driver);
		driver.get(URL);

		// login website
		LogInPage lp = new LogInPage(driver);
		lp.getUser().sendKeys(USERNAME);
		lp.getPwd().sendKeys(PASSWORD);
		lp.getLoginbutton().click();
		Reporter.log("login", true);
	}

	@AfterMethod(groups = {"smoke", "regression"})
	public void afterMethod() {
		CartPage cp = new CartPage(driver);
		cp.getMenuicon().click();
		cp.getLogout().click();
		Reporter.log("logout", true);
	}

	@AfterClass(groups = {"smoke", "regression"})
	public void afterClass() {
		driver.quit();
		Reporter.log("close browser", true);
	}

	@AfterSuite(groups = {"smoke", "regression"})
	public void afterSuite() {
		Reporter.log("DB close", true);
	}

}
