package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginUserPage extends PageObject {
    @FindBy(id = "signIn-button-user")
    WebElement buttonLogin;

    public void clickButtonLogin(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(buttonLogin));
        buttonLogin.click();
    }

    @FindBy(id = "form-input-email-user")
    WebElement inputEmailLogin;

    @FindBy(id = "form-input-pass-user")
    WebElement inputPasswordLogin;

    @FindBy(id = "signIn-user")
    WebElement loginUser;

    public void loginAccount(){
        inputEmailLogin.sendKeys("testqecoba12345@mail.com");
        inputPasswordLogin.sendKeys("testqecoba12");
    }
    public void clickLoginUser(){
        loginUser.click();
    }
    @FindBy(id = "avatar-user")
    WebElement cekLoginUser;

//    @FindBy(xpath = "(//button[normalize-space()='OK'])[1]")
//    WebElement klikOK;

    public void validasiLoginUser(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(cekLoginUser));
        Assert.assertTrue(cekLoginUser.isDisplayed());
    }
}
