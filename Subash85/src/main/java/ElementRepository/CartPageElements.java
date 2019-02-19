package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CartPageElements {

    WebDriver driver;

    public CartPageElements(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath ="//*[@id=\"contents_wrapper\"]/div[2]/text()") @CacheLookup
    private WebElement cartPageSubtitle;

    @FindAll
    (@FindBy(xpath =".//*[@class='inventory_item_name']")) @CacheLookup
    private List<WebElement> elementName;





    public boolean checkItemsinCart(String cartItem) {

        boolean iteamAvailableinCart = false;
        if (elementName.contains("a")) {
            System.out.println("It's there");
        }

        for (WebElement ele : elementName) {

            if(cartItem.equals(ele.getText())) {
                iteamAvailableinCart = true;
                break;
            }

        }

        return iteamAvailableinCart;
    }


}
