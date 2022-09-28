package code.day4_ImplicitlywaitCheckBox;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c2_CheckBox {

    //1. Open Chrome browser
    //2. Go to https://demo.guru99.com/test/radio.html
    //3. Verify checkbox1 is not selected
    //4. Click to checkbox2
    //5. Verify checkbox2 is selected

    public static void main(String[] args) {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
                //2. Go to https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");

        WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));

        if (!checkbox1.isSelected()){
            System.out.println("check box is not selected, verification has passed");
        }else System.out.println();


        WebElement Checkbox2=driver.findElement(By.id("vfb-6-0"));{

        }





    }
}
