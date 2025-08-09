package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import KaceGroupId.KaceArtifaceId.HomePage;
import KaceGroupId.KaceArtifaceId.KaceCatalogue;
import KaceGroupId.KaceArtifaceId.LandingPage;
import TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitionImpl  extends BaseTest{
	public LandingPage landingPage;
	public KaceCatalogue productCatalogue;
	public HomePage homePage;
	
	@Given("I landed on Kace Page")
	public void I_landed_on_Kace_Page() throws IOException
	{
		landingPage = launchApplication();
	}

	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username, String password)
	{
		homePage = landingPage.loginApplication(username,password);
	}
	
	
	
//	@When("^I add product (.+) to Cart$")
//	public void i_add_product_to_cart(String productName) throws InterruptedException
//	{
//		List<WebElement> products = productCatalogue.getProductList();
//		productCatalogue.addProductToCart(productName);
//	}
//	
//	@When("^Checkout (.+) and submit the order$")
//	public void checkout_submit_order(String productName)
//	{
//		CartPage cartPage = productCatalogue.goToCartPage();
//
//		Boolean match = cartPage.VerifyProductDisplay(productName);
//		Assert.assertTrue(match);
//		CheckoutPage checkoutPage = cartPage.goToCheckout();
//		checkoutPage.selectCountry("india");
//		 confirmationPage = checkoutPage.submitOrder();
//	}
	

    @Then("{string} message is displayed on HomePage")
    public void message_displayed_homePage(String string)
    {
    	String homePageMessage = homePage.getHomePageMessage();
		Assert.assertTrue(homePageMessage.equalsIgnoreCase(string));
		driver.close();
    }
    
    @Then("^\"([^\"]*)\" message is displayed$")
    public void something_message_is_displayed(String strArg1) throws Throwable {
   
    	Assert.assertEquals(strArg1, landingPage.getErrorMessage());
    	driver.close();
    }
}
