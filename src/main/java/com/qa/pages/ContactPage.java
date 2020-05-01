package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ContactPage extends TestBase
{
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement contactlabel;
	
	@FindBy(xpath = "//input[@name = 'id']")
	WebElement checkbox;
	
	
	
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean Contact_verifylabel() 
	{
		boolean label_value = contactlabel.isDisplayed();
		return label_value;
		
	}
	
	public boolean Contact_verifycheckboxcheck()
	{
		boolean check_valu = checkbox.isSelected();
		return check_valu;
	}

	
	public void Contact_contactcustomer_name(String name)
	{
		driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]")).click();
	}
	
	
	
}
