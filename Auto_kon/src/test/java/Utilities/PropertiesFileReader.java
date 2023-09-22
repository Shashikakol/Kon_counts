package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFileReader 
{
	public static void main(String[] args)  {
		  File file = new File("resources/browser-config.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
}
	public Properties getProperty() {
        {
            FileInputStream inputStream=null;
            Properties properties =  new Properties();
            try {
                properties.load(new FileInputStream("resources/browser-config.properties"));
            }catch(Exception e) {
                System.out.println("Exception:"+e);
            }
            return properties;
      
        }
 }
}

