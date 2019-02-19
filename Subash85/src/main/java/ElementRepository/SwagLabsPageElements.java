package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SwagLabsPageElements {

    WebDriver driver;

    public SwagLabsPageElements(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath=" //*[@id=\"item_4_title_link\"]/div") @CacheLookup
    private WebElement backPack_Desc_ID;

    @FindBy(xpath=" //*[@id=\"item_0_title_link\"]/div") @CacheLookup
    private WebElement bikeLight_Desc_ID;



    @FindBy(xpath="//*[@id='item_4_title_link']/following::button[@class='add-to-cart-button']") @CacheLookup
    private WebElement AddtoCart_BackPackID1;

    @FindBy(xpath="//*[@id='item_0_title_link']/following::button[@class='add-to-cart-button']") @CacheLookup
    private WebElement AddtoCart_BikeLightID;

    @FindBy(xpath=" //*[@id=\"shopping_cart_container\"]") @CacheLookup
    private WebElement shoppingCartID;

    @FindBy(xpath="//*['@id=shopping_cart_container']/a/span") @CacheLookup
    private WebElement shoppingCartBadgeID;



    public void checkBackPackAvailable() {

        backPack_Desc_ID.isDisplayed();
        System.out.println("backPack_Desc_ID.getAttribute(\"innerText\")"+backPack_Desc_ID.getAttribute("innerText"));
        Assert.assertEquals("Sauce Labs Backpack",backPack_Desc_ID.getAttribute("innerText"));

    }

    public void AddtoCart_BackPack() {

        AddtoCart_BackPackID1.isDisplayed();
        AddtoCart_BackPackID1.isEnabled();
        AddtoCart_BackPackID1.click();

    }
    public void checkbikeLightAvailable() {

        bikeLight_Desc_ID.isDisplayed();
        System.out.println("Bike Light"+bikeLight_Desc_ID.getAttribute("innerText"));
        Assert.assertEquals("Sauce Labs Bike Light",bikeLight_Desc_ID.getAttribute("innerText"));

    }

    public void AddtoCart_BikeLight(){

        AddtoCart_BikeLightID.isDisplayed();
        AddtoCart_BikeLightID.isEnabled();
        AddtoCart_BikeLightID.click();
    }

    public void checkAndClickShoppingCart() {

        shoppingCartID.isDisplayed();
        shoppingCartID.isEnabled();
        shoppingCartID.click();

    }

    public void checkShoppingCartBadge() {

        shoppingCartBadgeID.isEnabled();
        shoppingCartBadgeID.isEnabled();


    }

}
