package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class registerUserPage extends PageObject {
    @FindBy(xpath = "//a[normalize-space()='Daftar']")
    WebElement buttonDaftar;

    public void clickButtonDaftar(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(buttonDaftar));
        buttonDaftar.click();
    }

    @FindBy(xpath = "//input[@placeholder='username']")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='form-password-user']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[normalize-space()='Sign up']")
    WebElement daftarUser;

    public void registerAccount(){
        inputUsername.sendKeys("testqecoba12345");
        inputEmail.sendKeys("testqecoba12345@gmail.com");
        inputPassword.sendKeys("testqecoba12345");
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
