package FileReading;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import Excel.Excel;


public class FileReading extends Excel{
	
	protected Properties prop=new Properties();
	 
	
	
	/*
	 * Reading the Properties file
	 */
	public void fileProperties() {
	
		try {
			  
			//creating the object to the file input Stream
			InputStream input=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\899612_RoyalCarribeanAlaska\\Application Properties\\File.properties");
			
			//loading the property file
			prop.load(input);
			
			} 
		  
		  // catching the exceptions if occurs
		catch (IOException e)
			{
			  
			  //printing the detailed description of the exception
			e.printStackTrace();
			}
		}
	
}
