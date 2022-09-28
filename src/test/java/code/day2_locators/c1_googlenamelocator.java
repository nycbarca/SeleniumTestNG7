package code.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_googlenamelocator {
    // task: Google search
    // 1-OPen a chrome browser
    //2-Go to : https://google.com
    // 3- Write "orange" in search box
    // 4-Click google search button
    // 5-Verify title
    // Expected : Title should start "orange" word

    public static void main(String[] args) throws InterruptedException {
          //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2- Go to: https://google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();
        //3- Write "orange" in search box
        //Using locator with Name locator
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("orange");
        Thread.sleep(4000);
        //4- Click google search button
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        //5- Verify title:
        //Expected: Title should start with "orange" word
        String expectedTitle = "orange";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Orange Title verification has passed");
        } else {
            System.out.println("Orange Title verification has failed");
        }
        //6-navigate back
        //7-write banana in search box
        //8-verify title contains banana.
        driver.navigate().back();
        Thread.sleep(4000);
        WebElement secondSearch = driver.findElement(By.name("q"));
        secondSearch.sendKeys("banana" + Keys.ENTER);
        String expected = "banana";
        String actual = driver.getTitle();
        if (actual.startsWith(expected)) {
            System.out.println("banana title verification has passed");
        } else {
            System.out.println("banana title verification has failed");
        }
        driver.quit();

    }
}


