package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserCreateReservationPage extends PageObject {

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

    @FindBy(xpath = "//body/div[@id='root']/div[@class='list-wo container-list-wo']/div[@class='container']/div[@class='row-card my-5']/div[9]/div[1]")
    WebElement Package;

    public void clickPackage() {

        try {
            Package.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Package.click();
    }

    @FindBy(xpath = "//h3[@id='wo-name']")
    WebElement validateWO;

    public void setValidateWO() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(validateWO));
        Assert.assertTrue(validateWO.isDisplayed());
    }

    @FindBy(xpath = "//input[@id='custom-pax']")
    WebElement inputCustomPax;

    public void setInputCustomPax() {
        inputCustomPax.sendKeys("600");
    }

    @FindBy(xpath = "//input[@id='date-order']")
    WebElement chooseDate;

    public void setChooseDate() {
        chooseDate.click();
    }

    @FindBy(xpath = "//div[@aria-label='Choose Saturday, January 1st, 2022']")
    WebElement selectDate;

    public void setSelectDate() {
        selectDate.click();
    }

    @FindBy(xpath = "//textarea[@id='additional']")
    WebElement inputText;

    public void setInputText() {
        inputText.sendKeys("aku mau booking dengan crew yang profesional dan bertanggung jawab");
    }

    @FindBy(xpath = "//button[@id='order-button']")
    WebElement btnOrder;

    public void clickOrder() {
        btnOrder.click();
    }


}
