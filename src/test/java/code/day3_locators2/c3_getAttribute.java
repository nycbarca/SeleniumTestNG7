package code.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement gmailbutton=driver.findElement(By.xpath("//a[@class='gb_d"));
        System.out.println("Gmail button text is="+gmailbutton.getText());
        System.out.println("Gmail button, href attribute value="+gmailbutton.getAttribute("href"));
    }
}
