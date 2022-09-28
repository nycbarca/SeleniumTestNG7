package code.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_GoogleTitleVerification {
    public static void main(String[] args) {

        //Task
        //1.Open Chrome Driver
        //2.Go to Google
        //3.Verify title: Expected : Google

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //verify title
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Google title verification has passed");
        } else {
            System.out.println("Google title verification has failed");
        }
        driver.close();

    }

}