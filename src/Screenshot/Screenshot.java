package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Uitilities.Driverset;

public class Screenshot extends Driverset {
	
	public static int i=0;
	public static void screenShot() throws Exception {
		//Converting WebDriver object to takeScreenshoot
		TakesScreenshot scrShot =((TakesScreenshot)driver); 
		/*Calling the getScreenshotAs() method to 
		 *create an image file
		 */
		File Src=scrShot.getScreenshotAs(OutputType.FILE);	
		//Giving the location
		String filePath = System.getProperty("user.dir")+"//ScreenShot//Screenshot"+i+".png";
		
		i++;
		//Moving image file to new destination
		File Dest=new File(filePath);	 
		//copying file at destination
		FileUtils.copyFile(Src, Dest);				
	}
}
