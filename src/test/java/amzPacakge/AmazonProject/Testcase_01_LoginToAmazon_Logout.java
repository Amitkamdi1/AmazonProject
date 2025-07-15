package amzPacakge.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Testcase_01_LoginToAmazon_Logout extends BaseClass {
	
	
	@Test
	
	public void logginwithValidCredentils() throws InterruptedException {
		
		AmazonHomePage Logging = new AmazonHomePage(driver);
		
		Logging.HoverOverAccountList(driver);
		Logging.SingIn();
		
		AmazonLoginPage Signin = new AmazonLoginPage(driver);
		Signin.UserName();
		Signin.Continue();
		Signin.Password();
		Signin.SingIn();
		
		Logging.HoverOverAccountList(driver);
		Logging.Logout();
	}

}
