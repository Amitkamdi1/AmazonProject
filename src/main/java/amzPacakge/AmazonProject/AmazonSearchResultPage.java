package amzPacakge.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchResultPage {

	WebDriver driver;
	// Steps1
	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[5]")
	WebElement selectPrdocut;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement AddToCart;
	
	@FindBy(xpath = "//input[@class='a-button-input a-declarative']")
	WebElement Wishlist;
	
	@FindBy(xpath ="//button[@data-action='a-popover-close']")
	WebElement CLose;
	
	@FindBy(linkText = "View Your List")
	WebElement YourList;
	
	@FindBy(linkText = "Add to Cart")
	WebElement AddTOCart2;
	
	@FindBy(linkText = "View Cart")
	WebElement ViewCart;
	
	// Steps2

	public void ProductSelect() {

		selectPrdocut.click();

	}

	public void cartAdding() {
		
		Wishlist.click();

	}
	public void AddToWishlist() {

		Wishlist.click();

	}
	
	public void closeButton() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.visibilityOf(CLose));
		 CLose.click();
		

	}
	
	
	public void ViewYourList() {

		YourList.click();

	}
	
	public void AddTocart2() {

		AddTOCart2.click();

	}

	public void ViewCartProduct() {

		ViewCart.click();

	}
	

//steps3

	public AmazonSearchResultPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
