package amzPacakge.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {

	WebDriver driver;
	// Steps1
	@FindBy(xpath = "//input[@id='ap_email_login']")
	WebElement UN;

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement ContinueButton;

	@FindBy(id = "ap_password")
	WebElement Pass;

	@FindBy(id = "signInSubmit")
	WebElement SingINbutton;

	// Steps2

	public void UserName() {

	UN.sendKeys("7498794932");

	}

	public void Continue() {
		ContinueButton.click();

	}

	public void Password() {
		Pass.sendKeys("Amit@12");
	}

	public void SingIn() {
		SingINbutton.click();

	}

//steps3

	public AmazonLoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
