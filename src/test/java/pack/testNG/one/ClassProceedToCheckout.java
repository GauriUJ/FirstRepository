package pack.testNG.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassProceedToCheckout {

	WebDriver driver;
	  
	  public ClassProceedToCheckout(WebDriver driver2)
	  {
	    driver = driver2;
	  }
	  
	  public void proceedToCheckout() throws InterruptedException {
	    Thread.sleep(5000L);
	    WebElement finalCheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout'][@class='button btn btn-default standard-checkout button-medium']"));
	    finalCheckout.click();
	  }
}
