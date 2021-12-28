package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ProfileUserPage extends PageObject {

    //Web Elemet Pre-Condition
    @FindBy(xpath = "//img[@id='navbar-logo-bef-login']")
    WebElement logoWeb;

    public void clicklogoWeb() {
        logoWeb.click();
    }

    @FindBy(xpath = "//a[@id='signIn-button-user']")
    WebElement btnMasuk;

    public void setBtnMasuk() {
        btnMasuk.click();
    }

    @FindBy(xpath = "//input[@id='form-input-email-user']")
    WebElement inputfieldEmail;

    public void setInputfieldEmail() {
        inputfieldEmail.sendKeys("iniuser@gmail.com");
    }

    @FindBy(xpath = "//input[@id='form-input-pass-user']")
    WebElement inputfieldPassword;

    public void setInputfieldPassword() {
        inputfieldPassword.sendKeys("12345678");
    }

    @FindBy(xpath = "//button[@id='signIn-user']")
    WebElement BtnSignin;

    public void setBtnSignin() {
        BtnSignin.click();
    }

    @FindBy(xpath = "//a[@class='name']")
    WebElement validateUsername;

    public void setValidateUsername() {
        Assert.assertEquals("iniuser", validateUsername.getText());
    }

    @FindBy(xpath = "//a[@class='name']")
    WebElement drpDwnProfile;

    public void setDrpDwnProfile() {
        drpDwnProfile.click();
    }

    @FindBy(xpath = "//a[@id='profile-menu-user']")
//    @FindBy(xpath = "//a[@id='history-menu-user']")
    WebElement ProfileUser;

    public void setProfileUser() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(ProfileUser));
        ProfileUser.click();
    }

    @FindBy(xpath = "//h1[normalize-space()='YOUR PROFILE']")
    WebElement validateProfileUser;

    public void setValidateProfileUser() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(validateProfileUser));
        Assert.assertTrue(validateProfileUser.isDisplayed());
    }

}
