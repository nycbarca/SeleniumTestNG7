package Renastech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

    public static void main(String[] args) {

        //Create connection between selenium and browser
        //setup browser

        WebDriverManager.chromiumdriver().setup();

        //create instance of chromedriver
        WebDriver driver= new ChromeDriver();

        //go to google

        driver.get("https://www.amazon.com/");
    }
}
