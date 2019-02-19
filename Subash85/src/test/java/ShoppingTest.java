import ElementRepository.CartPageElements;
import ElementRepository.LoginPageElements;
import ElementRepository.SwagLabsPageElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {

    @Test
    @Parameters({"username","password"})
    public void initLogin(String username,String password) throws Exception{


            driver.get("https://www.saucedemo.com");
            Assert.assertEquals("Swag Labs", driver.getTitle());

        LoginPageElements loginpage = PageFactory.initElements(driver, LoginPageElements.class);
        loginpage.setUserNameTxtBox(username);
        loginpage.setPassWordTxtBox(password);
        loginpage.clickLoginBtn();


    }

    @Test(dependsOnMethods = "initLogin")
    public void shopItems() throws Exception{

        Assert.assertEquals("Swag Labs", driver.getTitle());
        SwagLabsPageElements swagPage = PageFactory.initElements(driver, SwagLabsPageElements.class);
        swagPage.checkBackPackAvailable();;
        swagPage.AddtoCart_BackPack();
        swagPage.checkbikeLightAvailable();
        swagPage.AddtoCart_BikeLight();
        swagPage.checkShoppingCartBadge();
        swagPage.checkAndClickShoppingCart();

    }
    @Test(dependsOnMethods = "shopItems")
    public void checkCartItemList() throws Exception{

       // Assert.assertEquals("Swag Labs", driver.getTitle());
        CartPageElements cartPage = PageFactory.initElements(driver, CartPageElements.class);
        if(cartPage.checkItemsinCart("Sauce Labs Backpack"))
            System.out.println("Sauce Labs Backpack is available in cart");
        cartPage.checkItemsinCart("Sauce Labs Bike Light");
        if(cartPage.checkItemsinCart("Sauce Labs Bike Light"))
            System.out.println("Sauce Labs Bike Light is  available in cart");
    }


}




