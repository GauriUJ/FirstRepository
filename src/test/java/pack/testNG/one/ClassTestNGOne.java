package pack.testNG.one;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ClassTestNGOne {

	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		System.out.println("test f");
		
		ClassLogin log = new ClassLogin(driver);
		log.login();
		
		ClassBuyAndAddToCart baatc1 = new ClassBuyAndAddToCart(driver);
	    baatc1.buyAndAddToCart();
	    
	    ClassProceedToCheckout ptco1 = new ClassProceedToCheckout(driver);
	    ptco1.proceedToCheckout();
	    
	    ClassAddressCheckOut aco1 = new ClassAddressCheckOut(driver);
	    aco1.addressCheckOut();
	    
	    ClassShipping ship = new ClassShipping(driver);
	    ship.shipping();
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("befor test f");

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test f");


		//driver.quit();
	}

}
