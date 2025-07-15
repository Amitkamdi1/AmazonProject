package amzPacakge.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;

	@BeforeMethod
	public void BrowserLaunch() {

	 	driver = new EdgeDriver();

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

	}

	@AfterMethod

	public void BrowserQuit() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}

}
