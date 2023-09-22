package GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility
{
	public String readDataFromPropertyFile(String key) throws Throwable
	{
	     FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\browser-config.properties");
	       Properties pLib = new Properties();
	       pLib.load(fis);
	        String value = pLib.getProperty(key);
	        return value;
	}
}
	/*	//String propFilepath= System.getProperty("user.dir")+"/home/aissel/Git2/DICM_Count/src/test/resources/browser-config.properties";
			
        FileInputStream fileInputStream = new FileInputStream(".\\src\\test\\resources\\browser-config.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);

        // Read properties from the file
        String appURL = properties.getProperty("url");
        String browser = properties.getProperty("browser");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        // Print the values (just for demonstration)
        System.out.println("App URL: " + appURL);
        System.out.println("browser: " + browser);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);*/

        // Perform your Selenium actions using the loaded properties
        // ...
        
      /*  try {
            properties.load(new FileInputStream("/src/test/resources/browser-config.properties"));
        }catch(Exception e) {
            System.out.println("Exception:"+e);
        }
        return null;
    }
		*/
	
