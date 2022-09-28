package code.day4_ImplicitlywaitCheckBox;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class c3_RadioButton {
    // Navigate to https://courses.letskodeit.com/practice
    // click on BMW RADIO button
    // verify that its selected
    public static void main(String[] args) {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // click on BMW RADIO button
        WebElement BMWRadio=driver.findElement(By.id("bmwradio"));
        BMWRadio.click();

        // verify that its selected

        boolean BMWRadioSelected=BMWRadio.isSelected();
        if (BMWRadioSelected){
            System.out.println("BMW is selected and verification has passed");

        }
        else {
            System.out.println("BMW is selected and verification has failed");
        }

        // verify that honda not selected

        WebElement HondaRadio=driver.findElement(By.xpath("//input[@id='hondaradio']"));
        if (!HondaRadio.isSelected()){
            System.out.println("Honda is not selected. verification has passed");
        }else
            System.out.println("Honda is not selected. verification has failed");

        driver.close();




    }
}
