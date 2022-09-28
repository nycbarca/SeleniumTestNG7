package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c2_SetUpWithDifferentBrowser {
    public static void main(String[] args) {
        //firefox driver setup
        // WebDriverManager.firefoxdriver().setup();
        //WebDriver driver=new FirefoxDriver();
        //driver.get("https;//www.google.com");

        //egde driver setup
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");



    }
}
