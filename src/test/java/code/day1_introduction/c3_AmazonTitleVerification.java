package code.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_AmazonTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //Task
        //Open Chrome Browser
        //Go to Google
        //Navigate Back
        //Navigate Forward
        //Navigate to https://www.amazon.com
        //Verify title contains :Smile

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Navigate Back
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();

        //Navigate to https://www.amazon.com
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com");

        //Verify title contains :Smile
        String actualTitle= driver.getTitle();
        String expectedTitle="Smile";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Amazon title verification has passed ");
        }else {
            System.out.println("Amazon title verification has failed ");

        }

        System.out.println("Actual title is:" +driver.getTitle());
        driver.close();





    }
}
