package pack.testNG.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassAddressCheckOut {
	
	WebDriver driver;
	  
	  public ClassAddressCheckOut(WebDriver driver2)
	  {
	    driver = driver2;
	  }
	  
	  public void addressCheckOut() throws InterruptedException {
	    Thread.sleep(5000L);
	    WebElement addComment = driver.findElement(By.xpath("//textarea[@name='message']"));
	    addComment.sendKeys(new CharSequence[] {
	      "Please deliver the parcel between 10 to 11 in the morning or 7 to 10 in the evening. Thanks!" });
	    
	    WebElement adressCheckout = driver
	      .findElement(By.xpath("//button[@type='submit'][@class='button btn btn-default button-medium']"));
	    adressCheckout.click();
	  }

}
