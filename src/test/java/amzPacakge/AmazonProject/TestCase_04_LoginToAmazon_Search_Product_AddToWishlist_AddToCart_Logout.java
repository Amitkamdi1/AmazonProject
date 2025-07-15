package amzPacakge.AmazonProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase_04_LoginToAmazon_Search_Product_AddToWishlist_AddToCart_Logout extends BaseClass{

	
	@Test
	
	public void AddTocart() throws InterruptedException {
		
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
		Logging.HoverOverAccountList(driver);
		Logging.Logout();
		
	
		
	}
	
}
