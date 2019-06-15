package com.pack.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLogin {

	WebDriver driver;

	public ClassLogin(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		driver = driver2;
	}


	public void login()
	{

		//-----------ID----------------
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("gauri@g.g");
		
		WebElement password= driver.findElement(By.id("passwd"));
		password.sendKeys("gauri@123");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		
	}

}
