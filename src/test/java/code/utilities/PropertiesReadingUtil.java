package code.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {
    private static Properties properties=new Properties();
    //encapsulation method, we hide date

    static {
        String pathForPropertiesFile="configuration.properties";

        try {

            FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);

            properties.load(fileInputStream);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        }
        public static String getProperties(String keyword){
        return properties.getProperty(keyword);
        }

    }


