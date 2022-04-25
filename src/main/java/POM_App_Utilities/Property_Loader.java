package POM_App_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Property_Loader {
	
	File file = new File("./AppFiles/BrowserData.properties");
	Properties prop =null;
	
	public Property_Loader() throws FileNotFoundException {
		
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception s) {
		s.printStackTrace();
		}
			
		}
		
	
	
	
	
	public String getbrowserType() {
		return prop.getProperty("browserType");
	}
	
	
	public String getbaseUrl() {
		return prop.getProperty("baseUrl");
	}
	
	

}
