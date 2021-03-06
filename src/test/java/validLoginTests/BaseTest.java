package validLoginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import browserUtils.Browser;
import pages.*;

public abstract class BaseTest {
	
	WebDriver driver;	
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected SignupPage signupPage;
	protected UserDashboardPage userDashboardPage;
	protected UserAccountPage userAccountPage;
	protected SearchResultPage searchResultPage;
	protected ProductDetails productDetails;
	protected CartPage cartPage;
	protected OrderSummaryPage orderSummaryPage;
protected PaymentPage paymentPage;
	
	@BeforeTest
	public void initialize() {		
		driver = Browser.getInstance("Chrome");
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		signupPage = new SignupPage(driver);
		userDashboardPage = new UserDashboardPage(driver); 
		userAccountPage = new UserAccountPage(driver);
		searchResultPage = new SearchResultPage(driver);
		productDetails = new ProductDetails(driver);
		cartPage = new CartPage(driver);
		orderSummaryPage = new OrderSummaryPage(driver);
		paymentPage = new PaymentPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		//Browser.quit();
	}

}
