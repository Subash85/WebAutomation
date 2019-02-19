import DriverFactory.DriverManager;
import DriverFactory.DriverManagerFactory;
import DriverFactory.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static DriverManager driverManager;
    public static WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);

        System.out.println(" beforeTest() ");
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println(" beforeMethod() ");
    }

    @AfterMethod
    public void afterMethod(Method method) {
        System.out.println(" afterMethod() ");
        if(method.getName()!=null)
        ReusableFunctions.captureScreenShot(driver,method.getName());
        else driverManager.quitDriver();

    }

    @AfterTest
    public void afterTest() {
        System.out.println(" afterMethod() ");
       // ReusableFunctions.captureScreenShot(driver,result.getMethod().getMethodName());
        driverManager.quitDriver();

    }
}
