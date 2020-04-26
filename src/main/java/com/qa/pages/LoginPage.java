package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase
{

	@FindBy(name = "email")
	WebElement username_email;
	
	@FindBy(name = "password")
	WebElement password;
	
	
	@FindBy(xpath = "//input[@name='password']//following::div[1]")
	WebElement loginbtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	

	public HomePage LoginSetup(String un,String Pwd)
	{
		username_email.sendKeys(un);
		password.sendKeys(Pwd);
		loginbtn.click();
		return new HomePage();
		
	}
	
	
	
	
	
	
	
	
	
	
}
