package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginWOPage extends PageObject {
    //web element pre-condition
    @FindBy(xpath = "//*[@id=\"navbar-logo-bef-login\"]")
    WebElement iconVirus;

    public void clickIconVirus() {
        iconVirus.click();

    }

    @FindBy(xpath = "//a[@id='signIn-button-user']")
    WebElement btnMasuk;

    public void clickbuttonMasuk() {

        btnMasuk.click();
    }

    @FindBy(xpath = "//button[@id='redirect-signIn-wo-page']")
    WebElement signinWO;

    public void clickbuttonsigninWO() {
        signinWO.click();

    }

    //Web Element
    @FindBy(xpath = "//input[@id='validationCustom03']")
    WebElement inputFieldEmail;

    public void setInputFieldEmail() {
        inputFieldEmail.sendKeys("iniwo11@gmail.com");
    }

    public void setInputInvalidEmail(String InvalidEmail) {
        inputFieldEmail.sendKeys(InvalidEmail);
    }

    @FindBy(xpath = "//input[@id='validationCustom05']")
    WebElement inputFieldPassword;

    public void setInputFieldPassword() {
        inputFieldPassword.sendKeys("12345678");
    }

    public void setnputInvalidPassword(String invalidPassword){
        inputFieldPassword.sendKeys(invalidPassword);
    }
    @FindBy(xpath ="//button[@id='btn-login-wo']")
    WebElement ClickBtnLoginWO;

    public void setClickBtnLoginWO(){
        ClickBtnLoginWO.click();
    }
    @FindBy (xpath = "//img[@alt='logo-wo']")
    WebElement validateUsername;

    public void setValidateUsername(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(validateUsername));
        Assert.assertTrue(validateUsername.isDisplayed());
    }
    @FindBy (xpath = "//div[contains(text(),'email is not valid!')]")
    WebElement validateAlert;

    public void setvalidateAlertEmail(){
        Assert.assertEquals("email is not valid!","email is not valid!", validateAlert.getText());
    }
    @FindBy(xpath = "///div[@class='mb-3 col-md-12']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement alertFieldEmailEmpty;

    public void setValidateAlertFieldEmailEmpty(){
        element(alertFieldEmailEmpty).waitUntilVisible();
    }
    @FindBy(xpath = "//div[@class='col-md-12']//div[@class='invalid-feedback'][normalize-space()='cannot be blank!']")
    WebElement alertFieldPasswordEmpty;

    public void  setValidateAlertFieldPasswordEmpty(){
        element(alertFieldPasswordEmpty).waitUntilVisible();
    }
}
