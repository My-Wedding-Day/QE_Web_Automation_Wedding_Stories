package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class listOrderUserPage extends PageObject {

    //Web Elemet Pre-Condition
    @FindBy(xpath = "//a[@id='signIn-button-user']")
    WebElement btnMasuk;

    public void ClickSignIn() {
        btnMasuk.click();
    }

    @FindBy(xpath = "//input[@id='form-input-email-user']")
    WebElement inputfieldEmail;

    public void setInputValidEmail() {
        inputfieldEmail.sendKeys("iniuser@gmail.com");
    }

    @FindBy(xpath = "//input[@id='form-input-pass-user']")
    WebElement inputfieldPassword;

    public void setInputValidPassword() {
        inputfieldPassword.sendKeys("12345678");
    }

    @FindBy(xpath = "//button[@id='signIn-user']")
    WebElement BtnSignin;

    public void clickbtnlogin() {
        BtnSignin.click();
    }

    @FindBy(xpath = "//a[@class='name']")
    WebElement validateUsername;

    public void setValidateUser() {
        Assert.assertEquals("iniuser", validateUsername.getText());
    }

    @FindBy(id="avatar-user")
    WebElement drpDwnHistory;

    public void setDrpDwnHistory() {

        element(drpDwnHistory).waitUntilClickable();
        try {
            drpDwnHistory.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        drpDwnHistory.click();
    }

    @FindBy(id="history-menu-user")
    WebElement History;

    public void clickbtnHistory() {
//        waitForCondition().until(ExpectedConditions.elementToBeClickable(History));
            History.click();
    }

    @FindBy(xpath = "//h2[normalize-space()='Your History Order']")
    WebElement validateMypackage;

    public void setValidateHistory() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(validateMypackage));
        Assert.assertTrue(validateMypackage.isDisplayed());
    }

}
