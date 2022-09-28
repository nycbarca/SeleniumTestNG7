package code.day4_ImplicitlywaitCheckBox;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class c1_implicitlywait {
    public static void main(String[] args) {

        //1.open browser
        // 2.go to the page https://www.vinexponewyork.com/
        //3.click on attend button

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com");
        //it is going  wait a specific time until page loaded
        // as soon as page loaded it will move on next step
        //implicitly wait will affect all code block where we

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='/attend/']")).click();

    }
}
