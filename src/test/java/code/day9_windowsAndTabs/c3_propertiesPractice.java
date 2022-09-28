package code.day9_windowsAndTabs;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class c3_propertiesPractice {
    @Test
    public void TC1_System_properties(){
        //java has some properties that we can use as system info
        System.out.println(System.getProperty("os.name"));
    }

    @Test
    public void configurationProperties(){
        Properties properties=new Properties();

        //this ia a path for properties file
        String patForPropertiesFile="configuration.properties";


        try {
            FileInputStream fileInputStream=new FileInputStream(patForPropertiesFile);
            properties.load(fileInputStream);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));


    }
}
