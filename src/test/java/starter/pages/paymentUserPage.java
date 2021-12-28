package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class paymentUserPage extends PageObject {

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
    WebElement drpDwn;

    public void setDrpDwn() {
        drpDwn.click();
    }

    @FindBy(xpath = "//a[@id='history-menu-user']")
    WebElement History;

    public void setHistory() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(History));
        History.click();
    }

    @FindBy(xpath = "//h2[normalize-space()='Your History Order']")
    WebElement validateProfilWO;

    public void setValidateProfileWO() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(validateProfilWO));
        Assert.assertTrue(validateProfilWO.isDisplayed());
    }

}

