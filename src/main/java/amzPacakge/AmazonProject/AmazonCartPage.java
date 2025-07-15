package amzPacakge.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonCartPage {

	
	
	WebDriver driver;
	// Steps1
	@FindBy(xpath = "//a[@id='nav-cart']")
	WebElement cartclick;
	
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	WebElement ProccedToBuy;
	
	@FindBy(linkText = "Add a new delivery address")
	WebElement AddNewAddress;
	
	  @FindBy(id = "address-ui-widgets-enterAddressFullName")
	     WebElement fullNameInput;

	
	// Steps2

	public void ClickonCart() {

		cartclick.click();

	}

	public void ClickonBuy() {

		ProccedToBuy.click();

	}
	public void AddAddress() {

		AddNewAddress.click();

	}
	
	public void FirstlastName() {

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address-ui-widgets-enterAddressFullName")));
		fullNameInput.sendKeys("Abc Test");

	}
	
	
	

//steps3

	public AmazonCartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}

