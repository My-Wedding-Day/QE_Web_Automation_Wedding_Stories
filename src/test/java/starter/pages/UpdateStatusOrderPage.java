package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UpdateStatusOrderPage extends PageObject {
    //web element pre-condition
    @FindBy(xpath = "//*[@id=\"navbar-logo-bef-login\"]")
    WebElement iconVirus;

    public void clickweb() {
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


    @FindBy(xpath = "//input[@id='validationCustom05']")
    WebElement inputFieldPassword;

    public void setInputFieldPassword() {
        inputFieldPassword.sendKeys("12345678");
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
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement popupWO;

    public void clickpopupWO(){
        popupWO.click();
    }
    @FindBy (xpath = "//a[@class='name']")
        WebElement drpDownOrderList;
    public void setDrpDownOrderList(){
        drpDownOrderList.click();
    }
    @FindBy (xpath = "//a[@id='listOrder-menu-wo']")
    WebElement orderlist;
    public void clickorderlist(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(orderlist));
        orderlist.click();
    }
    @FindBy (xpath = "//h2[normalize-space()='Order List']")
    WebElement validateOrder;
    public void setValidateOrder(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(validateOrder));
        Assert.assertTrue(validateOrder.isDisplayed());
    }
    @FindBy(xpath = "//div[4]//div[1]//h2[1]//button[1]")
    WebElement detailPackge;
    public void setDetailPackge(){
        detailPackge.click();
    }
    @FindBy(xpath = "//button[@id='accept']")
    WebElement acceptOrder;

    public void setAcceptOrder(){
        acceptOrder.click();

    }

    @FindBy(xpath = "//button[@id='btn-delete-package']")
    WebElement popUpAccept;

    public void clickPopUpAccept(){
        popUpAccept.click();
    }

}
