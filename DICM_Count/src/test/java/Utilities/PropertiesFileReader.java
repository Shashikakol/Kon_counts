package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

        public static void main(String[] args) throws IOException 
        {
            // Load the property file
        	String propFilepath= System.getProperty("user.dir")+"/src/test/resources/browser-config.properties";
            FileInputStream fileInputStream = new FileInputStream(propFilepath);
            Properties properties = new Properties();
            properties.load(fileInputStream);

            // Read properties from the file
            String appURL = properties.getProperty("app.url");
            String browser = properties.getProperty("browser");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            // Print the values (just for demonstration)
            System.out.println("App URL: " + appURL);
            System.out.println("browser: " + browser);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

            // Perform your Selenium actions using the loaded properties
            // ...
            
            try {
                properties.load(new FileInputStream("/src/test/resources/browser-config.properties"));
            }catch(Exception e) {
                System.out.println("Exception:"+e);
            }
            return ;
        }
        }
    
    

