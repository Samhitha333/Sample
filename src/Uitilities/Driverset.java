package Uitilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import FileReading.FileReading;
 


public class Driverset extends FileReading {
	
	  protected static WebDriver driver;
	
	
	/*
	 * Getting the Chrome driver from file properties
	 */
	public String getchromedriver() {
		
		fileProperties();
		 return prop.getProperty("chrome_driver");
		 
	}
	
	
	
	/*
	 * Setting the chrome browser
	 */
	public WebDriver getChromedriver() {
		
		String chromedriver_url=getchromedriver();
		
		//Setting path for the Chorme Driver
		System.setProperty("webdriver.chrome.driver",chromedriver_url);
		WebDriver d=new ChromeDriver();
		driver=d;
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	
	/*
	 * Getting the firefox driver from file properties
	 */
	public String getfirefoxdriver() {
		
		fileProperties();
		 return prop.getProperty("gecko_driver");
		 
		}
	
	
	
	/*
	 * Setting the firefox browser
	 */
	public WebDriver getGeckoWebdriver() {
		
		
		String firefoxdriver_url=getfirefoxdriver();
		
		//Setting path for the Gecko Driver
		System.setProperty("webdriver.gecko.driver",firefoxdriver_url);
		WebDriver d=new FirefoxDriver();
		driver=d;
		
		//Maximizing the window
		driver.manage().window().maximize();
		
		return driver;
	}

	
}
