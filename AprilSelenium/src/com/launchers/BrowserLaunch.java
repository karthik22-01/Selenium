package com.launchers;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTH\\OneDrive\\Desktop\\Selenium drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/KARTH/OneDrive/Desktop/Selenium drivers/geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.bestbuy.com");
	}
	
	
	
	
}
