package code.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_HelloSelenium {
    public static void main(String[] args) {

        System.out.println("hello selenium");

        //set up chrome driver

        WebDriverManager.chromiumdriver().setup();
        //create a driver instance

        WebDriver driver=new ChromeDriver();
        //navigate to chrome browser
        driver.get("https://www.amazon.com/");
        // go to apple
        driver.get("https://www.apple.com/");


    }
}
