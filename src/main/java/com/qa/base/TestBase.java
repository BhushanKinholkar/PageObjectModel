package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.TestUtil;

public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
		try {
			
			prop = new Properties();
			FileInputStream fp  = new FileInputStream("D:\\Bhushan_selenium\\GitProject\\Sampleproject\\"
					+ "src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
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
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
	}
	

}
