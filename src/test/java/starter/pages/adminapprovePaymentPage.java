package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class adminapprovePaymentPage extends PageObject {

    //WEB-PRECONDITION
    @FindBy(xpath = "//small[@id='admin-login']")
    WebElement Admin;

    public void clickAdmin(){
        try {
            Admin.click();
        } catch (Exception e) {
            e.printStackTrace();
        }  Admin.click();
    }
    @FindBy(xpath = "//input[@id='email-admin']")
    WebElement inputvalidEmail;

    public void setinputvalidEmail(){
        inputvalidEmail.sendKeys("admin@weddingstories.com");
    }
    @FindBy(xpath = "//input[@id='password-admin']")
    WebElement inputvalidPassword;

    public void setinputvalidPassword(){
        inputvalidPassword.sendKeys("admin123");
    }
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    WebElement Signin;
    public void setSignin(){
        Signin.click();
    }
    @FindBy(xpath = "//i[@id='avatar-user']")
    WebElement drpDwnDashboard;
    public void setDrpDwnDashboard(){
        drpDwnDashboard.click();
    }
    @FindBy(xpath = "//a[2]")
    WebElement Dashboard;
    public void setDashboard(){
        Dashboard.click();
    }
    @FindBy(xpath = "//h4[normalize-space()='List Payment User']")
    WebElement validatelistpaymentUser;

    public void setValidatelistpaymentUser(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(validatelistpaymentUser));
        Assert.assertTrue(validatelistpaymentUser.isDisplayed());
    }
    @FindBy(xpath = "//div[@class='list-payment']//div[2]//div[1]//h2[1]//button[1]//div[1]//div[1]")
    WebElement DrpdwnlistpaymentUser;

    public void setDrpdwnlistpaymentUser(){
        DrpdwnlistpaymentUser.click();
    }
    @FindBy(xpath = "//div[@class='accordion-collapse collapse show']//button[@id='detail-package-history']")
    WebElement btnAccept;

    public void setBtnAccept(){
        btnAccept.click();
    }
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement popUp;

    public void setPopUp(){
        popUp.click();
    }
}
