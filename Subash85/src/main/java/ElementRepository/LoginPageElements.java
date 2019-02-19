package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPageElements {

    WebDriver driver;

    public LoginPageElements(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id="user-name") @CacheLookup private WebElement userNameTxtBox;
    @FindBy(id="password") @CacheLookup private WebElement passWordTxtBox;
    @FindBy(xpath="//*[@id=\"login_button_container\"]/div/form/input[3]") @CacheLookup private WebElement loginBtn;

  public void setUserNameTxtBox(String username) {
         if (userNameTxtBox.isDisplayed()){
         Assert.assertEquals("Username",userNameTxtBox.getAttribute("placeholder"));
         userNameTxtBox.sendKeys(username);}
         else System.out.println("username Text box is not Available ");
    }

    public void setPassWordTxtBox(String password) {

       if( passWordTxtBox.isDisplayed()){
        Assert.assertEquals("Password",passWordTxtBox.getAttribute("placeholder"));
        passWordTxtBox.sendKeys(password);}
             else System.out.println("username Text box is not Available ");
    }

    public void clickLoginBtn() {
        if (loginBtn.isDisplayed() && loginBtn.isEnabled())
        loginBtn.click();
        else System.out.println("Login button not Working");

    }
}
