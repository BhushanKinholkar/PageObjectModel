package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CompaniesPage;
import com.qa.pages.ContactPage;
import com.qa.pages.DealsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.TasksPage;

public class HomePageTest extends TestBase
{
	
	LoginPage loginpage;
	HomePage homepage;
	CompaniesPage companiespage;
	ContactPage contactpage;
	DealsPage dealspage;
	TasksPage taskspage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void homeSetup()
	{
		initialization();
		loginpage = new LoginPage();
		companiespage = new CompaniesPage();
		contactpage = new ContactPage();
		dealspage = new DealsPage();
		homepage = new HomePage();
		taskspage = new TasksPage();
		
		homepage  = loginpage.LoginSetup(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void TitleVerify()
	{
		String  pagetitle = homepage.HomePageTilte();
		Assert.assertEquals(pagetitle, "Cogmento CRM");
	}
	
	
	@Test(priority = 3)
	public void VerifyContactPage()
	{
		contactpage = homepage.verifyContactPage();
	}
	
	@Test(priority = 4)
	public void VerifyCompaniesPage()
	{
		companiespage = homepage.verifyCompaniesPage();
	}
	
	@Test(priority = 5)
	public void VerifyDealsPage()
	{
		 dealspage = homepage.verifyDealsPage();
	}
	
	@Test(priority = 6)
	public void VerifyTasks()
	{
		taskspage = homepage.verifyTaskPage();
	}
	
	
	@Test(priority = 2)
	public void VerifyLoginUserName()
	{
		String username = homepage.VerifyLoginUserName();
		System.out.println(username);
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
}
