package pack.testNG.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassShipping {

	WebDriver driver;
	  
	  public ClassShipping(WebDriver driver2)
	  {
	    driver = driver2;
	  }
	  

	  void shipping()
	  {
	    WebElement checkbox1 = driver.findElement(By.id("cgv"));
	    checkbox1.click();
	    WebElement shippingCheckout = driver.findElement(By.xpath("//button[@type='submit'][@class='button btn btn-default standard-checkout button-medium']"));
	    shippingCheckout.click();
	  }
}
