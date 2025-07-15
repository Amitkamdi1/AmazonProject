package amzPacakge.AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

	WebDriver driver;
	// Steps1
	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement AcountandList;

	@FindBy(xpath = "//span[.='Sign in']")
	WebElement singinLink;
	
	@FindBy(id = "nav-item-signout")
	WebElement SingOut;
	
	@FindBy(id = "twotabsearchtextbox") 
	WebElement searchBox;

	// Steps2

	public void HoverOverAccountList(WebDriver driver) throws InterruptedException {

		Actions a1 = new Actions(driver);
		a1.moveToElement(AcountandList).perform();
		Thread.sleep(3000);

	}

	public void SingIn() {

		singinLink.click();
	}

	public void SerachBox() {

		searchBox.sendKeys("shoes" + Keys.ENTER);;
	}
	
	public void Logout() {

		SingOut.click();

	}
	
	
	

//steps3

	public AmazonHomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
