package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase 
{
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement verifycontactpage;
	
	@FindBy(xpath = "//span[contains(text(),'Companies')]")
	WebElement verifycompaniespage;
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement verifydealspage;
	
	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement verifytaskspage;
	
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement usernameverify;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String HomePageTilte()
	{
		return driver.getTitle();
	}
	
	
	public String  VerifyLoginUserName()
	{
		return usernameverify.getText();
	}
	
	public boolean VerifyLoginUsernamedisplay()
	{
		 boolean val= usernameverify.isDisplayed();
		 return val;
	}
	
	
	
	public ContactPage verifyContactPage()
	{
		verifycontactpage.click();
		return new ContactPage();
		
	}
	
	public CompaniesPage verifyCompaniesPage()
	{
		verifycompaniespage.click();
		return new CompaniesPage();
		
	}
	
	public DealsPage verifyDealsPage()
	{
		verifydealspage.click();
		return new DealsPage();
		
	}
	
	public TasksPage verifyTaskPage()
	{
		verifytaskspage.click();
		return new TasksPage();
		
	}
	
	
	
	
	
	
}
