import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ReusableFunctions {


    /** Just call this method to get screenshot when ever you want
     * @param ldriver
     */
    public static void captureScreenShot(WebDriver ldriver, String PageName){

        File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
        try {

            FileUtils.copyFile(src, new File("src/test/Screenshot/"+PageName+"_"+System.currentTimeMillis()+".png"));
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}


