package Testcases;
import Screenshot.Screenshot;
import Uitilities.RoyalCarribeanAlaska;

public class Main extends RoyalCarribeanAlaska {
	
public static void main(String[] args) throws Exception  {
	
	    //Creating an object for RoyalCarribeanAlaska
		RoyalCarribeanAlaska royal=new RoyalCarribeanAlaska();
		
		//Method call for Accessing the browser
		royal.createDriver(royal.getbrowser());
		
		//Method call for Navigate to Url
		royal.navigateUrl(royal.geturl());
		
		//Method call for verifiying Title 
		royal.verifyingTitle();
		
		//Method call for Holiday Cruises operations
		royal.holidayCruises();
		
		Screenshot.screenShot();
		//Method call for Deck Plans operations
		royal.deckPlans();
		
	    //Method call for closing the Browser
		royal.closeBrowser();
		
	}
}
