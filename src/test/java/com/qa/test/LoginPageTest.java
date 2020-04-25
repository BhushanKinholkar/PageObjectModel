package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void Setup()
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	
	@Test
	public void loginTeest()
	{
		homepage = loginpage.LoginSetup(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	

}
