package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class deletePackagePage extends PageObject {
    //WEB PRE-CONDITION
    @FindBy(xpath = "//a[@id='signIn-button-user']")
    WebElement buttonSignIn;

    public void clickbtnSignIn() {
        buttonSignIn.click();
    }

    @FindBy(xpath = "//button[@id='redirect-signIn-wo-page']")
    WebElement buttonSignInWo;

    public void clickbtnSignInWO() {
        buttonSignInWo.click();
    }

    @FindBy(xpath = "//input[@id='validationCustom03']")
    WebElement inputvalidEmail;

    public void setInputvalidEmail() {
        inputvalidEmail.sendKeys("iniwo11@gmail.com");
    }

    @FindBy(xpath = "//input[@id='validationCustom05']")
    WebElement inputvalidPassword;

    public void setInputvalidPassword() {
        inputvalidPassword.sendKeys("12345678");
    }

    @FindBy(xpath = "//button[@id='btn-login-wo']")
    WebElement btnLoginWO;

    public void ClickBtnloginWO() {
        btnLoginWO.click();
    }

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement popupOK;

    public void clickpopupOK() {
        popupOK.click();
    }

    @FindBy(xpath = "//img[@alt='logo-wo']")
    WebElement validasiuserWO;

    public void setValidasiuserWO() {
        Assert.assertTrue(validasiuserWO.isDisplayed());
    }

    @FindBy(xpath = "//a[@class='name']")
    WebElement dropdown;

    public void clickdropdown() {
        dropdown.click();
    }

    @FindBy(xpath = "//a[@id='packages-menu-wo']")
    WebElement Mypackage;

    public void clickmyPackage() {
        Mypackage.click();
    }

    @FindBy(xpath = "//h2[normalize-space()='My Packages']")
    WebElement validasiPackage;

    public void setValidasiPackage() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(validasiPackage));
        Assert.assertTrue(validasiPackage.isDisplayed());
    }

    @FindBy(xpath = "//div[@id='1']//i[@class='bi bi-trash m-3 cursor']")
    WebElement deletePackage;

    public void setDeletePackage(){
        try {
            deletePackage.click();
        } catch (Exception e) {
            e.printStackTrace();
        }deletePackage.click();
    }
    @FindBy(xpath = "//button[@id='btn-delete-package']")
    WebElement popupYes;

    public void setPopupYes(){
        popupYes.click();
    }
}


