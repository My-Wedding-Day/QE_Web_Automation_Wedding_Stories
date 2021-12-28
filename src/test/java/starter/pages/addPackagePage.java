package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class addPackagePage extends PageObject {


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

    @FindBy(xpath = "//button[@id='nav-form-add-package']")
    WebElement addPackage;

    public void clickaddPackge() {
        addPackage.click();
    }

    @FindBy(xpath = "//h2[normalize-space()='Add New Package']")
    WebElement validasiNewPackage;

    public void setValidasiNewPackage() {
        Assert.assertTrue(validasiNewPackage.isDisplayed());
    }

    @FindBy(xpath = "//input[@id='validationCustom03']")
    WebElement inputPackageName;

    public void setInputPackageName() {
        inputPackageName.sendKeys("Nikah Murah Guys");
    }

    @FindBy(xpath = "//div[@class='border mt-3 mb-3 row']//div[2]//input[1]")
    WebElement inputPrice;

    public void setInputPrice() {
        inputPrice.sendKeys("12000000");
    }

    @FindBy(xpath = "//div[3]//input[1]")
    WebElement inputPax;

    public void setInputPax() {
        inputPax.sendKeys("100");
    }

    @FindBy(xpath = "//textarea[@id='validationCustom05']")
    WebElement inputDescription;

    public void setInputDescription() {
        inputDescription.sendKeys("ini adalah paket nikah paling murah seIndonesia ya guys!!");
        inputDescription.sendKeys(Keys.PAGE_DOWN);

    }

    @FindBy(xpath = "//input[@type='file']")
    WebElement chooseImg;

    public void uploadFoto(String filename) {

        upload(filename).to(chooseImg);
    }

    @FindBy(xpath = "//button[@id='btn-add-package']")
    WebElement save;

    public void setSave() {
        save.click();
    }

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement POPUPok;

    public void clickpopupok() {
        waitFor(POPUPok);
        POPUPok.click();
    }

}