package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;


public class ContactPageTest extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	
	
	
	public ContactPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void homeSetup()
	{
		initialization();
		loginpage = new LoginPage();
		homepage  = loginpage.LoginSetup(prop.getProperty("username"), prop.getProperty("password"));
		contactpage = homepage.verifyContactPage();
	}
	
	@Test(priority = 1)
	public void contactlabelverify()
	{
		Assert.assertTrue(contactpage.Contact_verifylabel());
	}
	
	
	@Test(priority = 2)
	public void checkboxverify()
	{
		Assert.assertTrue(contactpage.Contact_verifycheckboxcheck());
	}
	
	
	@Test(priority = 3)
	public void contactnamecheck() 
	{
		contactpage.Contact_contactcustomer_name("raj deva kumar");
		contactpage.Contact_contactcustomer_name("bhushan prakash kinholkar");
		
	}
	

	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
