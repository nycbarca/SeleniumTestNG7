package code.day9_windowsAndTabs;

import code.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c1_Tabs  extends TestBase {
     //OOP concept, inheritance method
     //navigate to https://renas-practice.herokuapp.com/home
     //click on elements
     //click on windows
    @Test
    public void TC1_handlingTabs(){
        driver.get("https://renas-practice.herokuapp.com/home");

        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();

        //click on windows
        driver.findElement(By.id("WindowsII")).click();

        //this will store current and only
        String currentWindow=driver.getWindowHandle();

        System.out.println("current window is="+currentWindow);
        System.out.println(" current title is="+driver.getTitle());

        //click on new button "click me" button
        WebElement openNewTabButton=driver.findElement(By.id("open-tab"));
        openNewTabButton.click();

        System.out.println("The current title="+driver.getTitle());










    }



}
