package com.launchers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectpath+"\\data.properties");
		
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectpath+"\\environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectpath+"\\"+e+".properties");
         childProp = new Properties();
         childProp.load(fis);
         System.out.println(childProp.getProperty("amazonurl"));
	}
	
	
	public static void openBrowser(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTH\\OneDrive\\Desktop\\Selenium drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:/Users/KARTH/OneDrive/Desktop/Selenium drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		}
	
	
public static void navigateUrl(String url)
	{
		
    driver.get(childProp.getProperty(url));
	}

}
