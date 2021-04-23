								Case Study: Royal Caribbean Alaska-cruises  
                               
Problem Statement:   

Find the Holiday Cruises, search for Rhapsody of the Seas and check the number of search results greater than 300000 or not. Select a Deck plan of eight. 
	1.Open the application, check for the presence of Holiday Cruises.  
	2.Click on Holiday Cruises and Search for Rhapsody of the Seas. 
	3.Check that the number of search results displayed are greater than 300000 
	4.Find and Click on Deck plans. 
	5.Select view as Deck Eight. 
	6.Check that Royal Suite is displayed. 
  Suggested site: https://www.royalcaribbean.com/alaska-cruises
  
Detailed Description: 
	1.Launch the website, https://www.royalcaribbean.com/alaska-cruises 
	2.Scroll down the page. 
	3.Check for the presence of Holiday Cruises. 
	4.If Holiday Cruises displays, print the status as Pass otherwise Fail. 
	5.Click on Holiday Cruises. 
	6.Check the presence of search option. 
	7.Search for "Rhapsody of the Seas". 
	8.Get the number of search results displayed and Compare it with 300000. 
	9.Find and click on "Deck Plans | Rhapsody of the Seas | Royal Caribbean Cruises" in the search result. 
	10.Check for the Deck plan image. If the image displays, print status as Pass otherwise Fail. 
	11.Select View as Deck Eight. 
	12.Check the presence of Royal Suite, if it presents print the status as Pass otherwise Fail. 
	13.Close the browser. 
	
Key Automation Scope: 
	1.Locating elements by xpath, linkText and partialLinkText. 
	2.Retrieving Web Element properties. 
	3.Scrolling into view of the Web Element. 
	4.Synchronization using Explicit Wait. 
	5.Check for the presence of Web Element. 
	6.Using Select class to select the dropdown options.
	
#######################################################################################################################################################################
									Project Structure 
#######################################################################################################################################################################
Project Contain 5 packages
1.Testcases
	This package contains 
			1.Main.java 		:	This file contains steps to call all methods in the RoyalCarribeanAlaska class.

2.Uitilities
	This package contains 2 files
			1.Driverset.java		:	This file contains driver setup.
			2.RoyalCarribeanAlaska.java	:	This file contains steps for execution of project.
3.FileReading
	This package contains 
			1.FileReading.java		:	This file contains implementation to Read the file properties.

4.Excel
	This package contains 
			1.Excel.java		:	This file contains implementation to Read Excel.

5.Screenshot
	This package contains
			1.Screenshot.java		:	This file contains implementation to take Screenshot.

Project Contain 3 Folders.

1Application Property:
	This folder contains the file which maintains hardcoded inputs.

2.Excel:
	This folder contains the excel sheet which maintains search data.

3.Screenshot:
	This folder contains Screenshot of the Search Results.

#######################################################################################################################################################################
								Following requirements are Automated
#######################################################################################################################################################################

1.Launch the website, https://www.royalcaribbean.com/alaska-cruises 
2.Scroll down the page. 
3.Check for the presence of Holiday Cruises. 
4.If Holiday Cruises displays, print the status as Pass otherwise Fail. 
5.Click on Holiday Cruises. 
6.Check the presence of search option. 
7.Search for "Rhapsody of the Seas". 
8.Get the number of search results displayed and Compare it with 300000. 
9.Find and click on "Deck Plans | Rhapsody of the Seas | Royal Caribbean Cruises" in the search result. 
10.Check for the Deck plan image. If the image displays, print status as Pass otherwise Fail. 
11.Select View as Deck Eight. 
12.Check the presence of Royal Suite, if it presents print the status as Pass otherwise Fail. 
13.Close the browser. 

#######################################################################################################################################################################
									Mandatory Implementations
#######################################################################################################################################################################

1.Multiple Browser Handling
2.Properties File Handling
3. External excel sheet Handling
4.Handle page synchronization issues.
5.Scrolling into view of the Web Element.

#######################################################################################################################################################################
									Additional Implementations
#######################################################################################################################################################################
	
1.Implemented the Screenshot funtionality.