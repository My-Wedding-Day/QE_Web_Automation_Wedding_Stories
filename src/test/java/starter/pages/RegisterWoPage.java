package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class RegisterWoPage extends PageObject {
    //web element pre-condition
    @FindBy(xpath = "//*[@id=\"navbar-logo-bef-login\"]")
    WebElement iconVirus;

    public void clickIconVirus() {
        iconVirus.click();

    }

    @FindBy(xpath = "//a[@id='signUp-button-user']")
    WebElement btnDaftar;

    public void clickbuttonDaftar() {
        btnDaftar.click();
    }

    @FindBy(xpath = "//button[@id='redirect-signUp-wo']")
    WebElement signupWO;

    public void clickbuttonsignupWO() {
        signupWO.click();

    }

    //Web element registerWO
    @FindBy(xpath = "//input[@id='validationCustomUsername']")
    WebElement inputFieldBussinessName;

    public void setInputFieldBussinessName() {

        inputFieldBussinessName.sendKeys("Ini WO Terbaik dulu");
    }

    public void setInputFieldBussinessName(String InvalidBussinessName) {
        inputFieldBussinessName.sendKeys(InvalidBussinessName);
    }

    @FindBy(xpath = "//input[@id='validationCustom03']")
    WebElement inputFieldEmail;

    public void setInputFieldEmail() {
        inputFieldEmail.sendKeys("iniwo11@gmail.com");
    }
    public void setInputFieldEmail(String InvalidEmail){
        inputFieldEmail.sendKeys(InvalidEmail);

    }

    @FindBy(xpath = "//input[@id='validationCustom04']")
    WebElement inputAddress;

    public void setInputAddress() {
        inputAddress.sendKeys("Jl Mulu jadian kagak");
    }

    @FindBy(xpath = "//option[@value='Jakarta']")
    WebElement chooseCity;

    public void setChooseCity() {
        try {
            chooseCity.click();
        } catch (Exception e) {
            e.printStackTrace();
        }chooseCity.click();
    }

    @FindBy(xpath = "//div[5]//input[1]")
    WebElement inputPhoneNumber;

    public void setInputPhoneNumber(String PhoneNumber) {
        inputPhoneNumber.sendKeys(PhoneNumber);
    }

    @FindBy(xpath = "//div[6]//input[1]")
    WebElement inputPassword;

    public void setInputPassword(String Password) {
        inputPassword.sendKeys(Password);
    }

    @FindBy(xpath = "//button[@id='btn-register-wo']")
    WebElement BtnRegister;

    public void setBtnRegister() {
        BtnRegister.click();
    }

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement ValidatePopUp;

    public void setValidatePopUp() {
        Assert.assertEquals("OK", ValidatePopUp.getText());
    }
}
