package pack.testNG.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClassBuyAndAddToCart {

	WebDriver driver;
	  
	  public ClassBuyAndAddToCart(WebDriver driver2)
	  {
	    driver = driver2;
	  }
	  

	  public void buyAndAddToCart() throws InterruptedException
	  {
	    WebElement selectCategory = driver.findElement(By.xpath("//a[text()='Women'][@title='Women']"));
	    selectCategory.click();
	    
	    WebElement selectDress = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
	    
	    selectDress.click();
	    WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	    driver.switchTo().frame(frameElement);
	    
	    WebElement selectDressQty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
	    selectDressQty.click();
	    

	    Select selectSize = new Select(driver.findElement(By.name("group_1")));
	    selectSize.selectByValue("2");
	    
	    WebElement selectColor = driver.findElement(By.name("Blue"));
	    selectColor.click();
	    
	    WebElement addToCart = driver.findElement(By.name("Submit"));
	    addToCart.click();
	    
	    driver.switchTo().defaultContent();
	    
	    Thread.sleep(5000L);
	    
	    WebElement checkOut = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	    checkOut.click();
	  }
}
