package amzPacakge.AmazonProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase_02_Add_To_Cart extends BaseClass{

	
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
		AddingProduct.cartAdding();
		Thread.sleep(3000);
		
		AddingProduct.closeButton();
		
		Logging.HoverOverAccountList(driver);
		Logging.Logout();
		
	}
	
}
