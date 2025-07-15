package amzPacakge.AmazonProject;

import org.testng.annotations.Test;

public class TestCase_05_Loggin_SearchProduct_WishList_AddToCart_SelectPaymentAsCreditCard_EnterCardDetails extends BaseClass
{

	
@Test
	
	public void EnterCardDetails() throws InterruptedException {
		
AmazonHomePage Logging = new AmazonHomePage(driver);
		
		Logging.HoverOverAccountList(driver);
		Logging.SingIn();
		
		AmazonLoginPage Signin = new AmazonLoginPage(driver);
		Signin.UserName();
		Signin.Continue();
		Signin.Password();
		Signin.SingIn();
		
		Logging.SerachBox();
		
		AmazonSearchResultPage AddingProduct = new AmazonSearchResultPage(driver);
		AddingProduct.ProductSelect();
		AddingProduct.AddToWishlist();
		Thread.sleep(2000);
		AddingProduct.ViewYourList();
		AddingProduct.AddTocart2();
		Thread.sleep(2000);
		
		
		AmazonCartPage Carticon = new AmazonCartPage(driver);
		Carticon.ClickonCart();
		Carticon.ClickonBuy();
		Carticon.AddAddress();
		
		Carticon.FirstlastName();
}	
}
