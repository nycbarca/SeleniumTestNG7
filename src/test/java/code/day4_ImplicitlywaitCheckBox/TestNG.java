package code.day4_ImplicitlywaitCheckBox;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

    @BeforeMethod
    public void setup() {
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void closing(){
        System.out.println("After method is running");
    }

    @Test
    public void TC1(){
        System.out.println("Test1 is running");
    }

    @Test
    public void TC2(){
        System.out.println("Test2 is running");

    }
}
