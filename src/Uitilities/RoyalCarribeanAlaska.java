package Uitilities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import FileReading.FileReading;



public class RoyalCarribeanAlaska extends FileReading{
	
	  public  WebDriver driver;
	static Driverset d=new Driverset();
	boolean launchUrl;
	String presence;
	
		
	
	
	/*
	 * Getting the Browser name from file properties
	 */
	public String getbrowser() {
			  
		//calling the fileProperties method
		fileProperties();
				
		//returning the browser name from property file
		return prop.getProperty("browser");
		}
	
	
	/*
	 * Getting the URL from file properties
	 */
	public String geturl() {
		
		//calling the fileProperties method
		fileProperties();
				
		//returning the Url name from property file
		return prop.getProperty("base_url");
		}

		

	
		
		/*
		 * Invoking the browser
		 */
	public WebDriver createDriver(String browser){
			
		if(browser.equalsIgnoreCase("chrome"))
			{
			//calling getChromeDriver from DriverSet class and initializing the static WebDriver driver object
			driver=d.getChromedriver();
			}
		else if(browser.equalsIgnoreCase("firefox"))
			{
			//calling getGeckoWebDriver from DriverSet class and initializing the static WebDriver driver object
			driver=d.getGeckoWebdriver();
			}
		
		return driver;	
		
		}
		
		
		
	/*
	 * Closing the signUp pages
	 */
	public boolean closeSignup() {
			
		//closing the signUp page
		if(driver.findElement(By.className("email-capture__close"))!= null)
		    {
			driver.findElement(By.className("email-capture__close")).click();
		    return true;
		     }
		
		return false;
			
		 }
		
		
		
		
	/*
	 * Scrolling the page
	 */
	public void navigateUrl(String Url) {
			
		JavascriptExecutor  jse= (JavascriptExecutor) driver;
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//Launch the website, https://www.royalcaribbean.com/alaska-cruises 
		driver.get(Url);
			
		//Scroll down the page.
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		}
		
		
		
		
	/*
	 * verifying the Title page
	 */
	public boolean verifyingTitle() {
			  
		// checking the correct url or not
		if(driver.getTitle().equals("Alaska Cruises: Alaskan Wild Beauty | Royal Caribbean Cruises"))
			
			launchUrl=true;
			
		else 
			launchUrl=false;	
			
	return launchUrl;
		}
		
		
		
		
	/*
	Check for the presence of Holiday Cruises. 
	If Holiday Cruises displays, print the status as Pass otherwise Fail. 
	Click on Holiday Cruises. 
	Check the presence of search option. 
	Search for "Rhapsody of the Seas". 
	Get the number of search results displayed and Compare it with 300000.
    */
	public void holidayCruises() throws Exception {
			
		try {
			//calling the closeSignup method
			closeSignup();
		}
			
		catch(Exception e) {
			
		}
			
		finally {
			//checking the Holiday cruises link
			if(driver.findElement(By.linkText("Holiday Cruises")) != null)
				presence="pass";
			
			else 
				presence="fail";
			
			System.out.println("Holiday Cruises displays:"+presence);
			
			
			//clicking the Holiday Cruises
			if(presence=="pass")
				
				driver.findElement(By.linkText("Holiday Cruises")).click();
			
			//Clicking the search button
			if(driver.findElement(By.xpath("//*[@id=\"rciSearchHeaderIcon\"]")) != null)
				
				driver.findElement(By.xpath("//*[@id=\"rciSearchHeaderIcon\"]")).click();
			
			//Search for "Rhapsody of the Seas"
			driver.findElement(By.xpath("//*[@id=\"rciSearchInput\"]")).sendKeys(datafetching());
			
			driver.findElement(By.xpath("//*[@id=\"rciSearchInputIcon\"]")).click();
			
			
			try {
				//comparing the results
				String[] results=driver.findElement(By.xpath("//*[@id=\"siteSearchApp\"]/div[1]/div/div[2]/div")).getText().split(" "); 
				String f=results[1];
				String v="";
			 
				for(int i=0;i<f.length();i++)
				{
					if(f.charAt(i)==',')
					{
						continue;
					}
					else
					{
						v+=f.charAt(i);
					}
				}
			    
				if(Integer.parseInt(v) > 300000)
					System.out.println("Search Results is greater than 300000");
				else
					System.out.println("Search Results is lesser than 300000");
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
		 
		 	
		   
		  
	/*Find and click on "Deck Plans | Rhapsody of the Seas | Royal Caribbean Cruises" in the search result. 
	Check for the Deck plan image. If the image displays, print status as Pass otherwise Fail. 
	Select View as Deck Eight. 
	Check the presence of Royal Suite, if it presents print the status as Pass otherwise Fail. 
	*/  
		  
	public void deckPlans() throws Exception{
			
		driver.findElement(By.partialLinkText("Deck Plans | Rhapsody of the Seas")).click();
			
		if(driver.findElement(By.xpath("//*[@id=\"deckPlanComponent-716245856\"]/img"))!=null)
			presence="pass";
		else
			presence="fail";
			
		System.out.println("Deck plan image displays:"+presence);
			
			
		//selecting the view as deck eight
		if(driver.findElement(By.id("deckDropdown"))!=null)
		{	
			Select deckPlan=new Select(driver.findElement(By.id("deckDropdown")));
			deckPlan.selectByVisibleText("Deck Eight");
		}
			
			
		//scrolling down and checking the presence of royal suit
		JavascriptExecutor jse=((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//h4[text() = 'Royal Suite - 1 Bedroom']")));
		
		
		String deckplan="Royal Suite - 1 Bedroom";
		
		//Explicit wait until image loaded
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='deck-image']")));

						
		if(driver.findElement(By.xpath("//h4[text() = 'Royal Suite - 1 Bedroom']"))!=null)
		{
			String text=driver.findElement(By.xpath("//h4[text() = 'Royal Suite - 1 Bedroom']")).getText();
			if(text.equals(deckplan))
			{
				presence="pass";
			}
			else
				presence="fail";
		}
			
		System.out.println("presence of Royal Suite:"+presence);
	}
	
	public void closeBrowser(){
		driver.close();
	}
		
}
