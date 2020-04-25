package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase
{

	private static final RegistrationPage RegistrationPage = null;

	@FindBy(name = "login")
	WebElement username;
	
	@FindBy(name = "passwd")
	WebElement password;
	
	
	@FindBy(name = "proceed")
	WebElement loginbtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage LoginSetup(String un,String Pwd)
	{
		username.sendKeys(un);
		password.sendKeys(Pwd);
		loginbtn.click();
		return new HomePage();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
