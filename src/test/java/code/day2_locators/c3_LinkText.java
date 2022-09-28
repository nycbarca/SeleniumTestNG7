package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_LinkText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //Click to Gmail link on the top right
        //in order to find with link text
        // driver.findElement(By.linkText("gmail")).click();

        //with partial linktext
        //driver.findElement(By.partialLinkText("Gm")).click();

        //locate with classname
        driver.findElement(By.className("gb_d")).click();

    }
}
