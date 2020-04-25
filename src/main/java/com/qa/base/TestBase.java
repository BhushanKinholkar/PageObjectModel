package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase
{
	static WebDriver driver;
	static Properties prop;
	
	public TestBase() throws Exception
	{
		prop = new Properties();
		FileInputStream fp = new FileInputStream("D:\\Bhushan_selenium\\GitProject\\Sampleproject\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fp);
	
	}
	
	public static void initialization()
	{
		String browser_name = prop.getProperty("browser");
		if(browser_name.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (browser_name.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("", "");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	

}
