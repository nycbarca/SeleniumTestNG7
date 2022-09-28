package code.utilities;

public class BrowserUtils {
    public static void staticWit(int second){
        try {
            Thread.sleep(1000*second);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void staticWait(int i) {
    }
}
