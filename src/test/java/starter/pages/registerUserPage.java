package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class registerUserPage extends PageObject {

    @FindBy(xpath = "//a[@id='signUp-button-user']")
    WebElement buttonDaftar;

    public void clickButtonDaftar() {
        try {
            buttonDaftar.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        buttonDaftar.click();
    }


    @FindBy(xpath = "//input[@id='form-username-user']")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@id='form-email-user']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='form-password-user']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@id='SignUp-user']")
    WebElement daftarUser;

    public void registerAccount(){
        inputUsername.sendKeys("testqecoba1");
        inputEmail.sendKeys("testqecoba12345@mail.com");
        inputPassword.sendKeys("testqecoba12");
    }
    public void clickDaftarUser(){
        daftarUser.click();
    }
     @FindBy(id = "avatar-user")
    WebElement cekDaftarUser;

//    @FindBy(xpath = "(//button[normalize-space()='OK'])[1]")
//    WebElement klikOK;

    public void validasiDaftarUser(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(cekDaftarUser));
        Assert.assertTrue(cekDaftarUser.isDisplayed());
    }
}
