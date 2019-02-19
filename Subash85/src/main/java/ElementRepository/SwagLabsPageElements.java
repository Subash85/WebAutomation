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
        

        if(backPack_Desc_ID.isDisplayed()) {
            System.out.println("Desc Available" + backPack_Desc_ID.getAttribute("innerText"));
            Assert.assertEquals("Sauce Labs Backpack",backPack_Desc_ID.getAttribute("innerText"));
        } else System.out.println("Sauce Labs Backpack is not Available");

    }

    public void AddtoCart_BackPack() {

        
        if (AddtoCart_BackPackID1.isDisplayed() && AddtoCart_BackPackID1.isEnabled()){
            AddtoCart_BackPackID1.click();}
        else System.out.println("Not able to add Sauce Labs Backpack to cart");
    

    }
    public void checkbikeLightAvailable() {

        if(bikeLight_Desc_ID.isDisplayed()) {
            System.out.println("Desc Available " + bikeLight_Desc_ID.getAttribute("innerText"));
            Assert.assertEquals("Sauce Labs Bike Light", bikeLight_Desc_ID.getAttribute("innerText"));
        } else System.out.println("Sauce Labs Bike Light is not Available");

    }

    public void AddtoCart_BikeLight(){

        if (AddtoCart_BikeLightID.isDisplayed() && AddtoCart_BikeLightID.isEnabled()){
            AddtoCart_BikeLightID.click();}
        else System.out.println("Not able to add Sauce Labs Bike Light to cart");
    }

    public void checkAndClickShoppingCart() {

     

        if (shoppingCartID.isDisplayed() && shoppingCartID.isEnabled()){
            shoppingCartID.click();}
        else System.out.println("Not able to click shopping cart");

    }

    public void checkShoppingCartBadge() {

       
        if (shoppingCartBadgeID.isDisplayed() && shoppingCartBadgeID.isEnabled()){
            System.out.println("shopping Cart Badge is available");}
        else System.out.println("shopping Cart Badge is not available");


    }

}
