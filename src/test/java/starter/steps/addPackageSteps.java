package starter.steps;

import starter.pages.addPackagePage;

public class addPackageSteps {

    addPackagePage addpackagepage;

    public void openHomePage() {
        addpackagepage.open();
    }

    public void openLoginPage() {
        addpackagepage.clickbtnSignIn();
    }

    public void ClickSignInWO() {
        addpackagepage.clickbtnSignInWO();
    }

    public void validEmailPasword() {
        addpackagepage.setInputvalidEmail();
        addpackagepage.setInputvalidPassword();
    }

    public void ClickbtnLogIn() {
        addpackagepage.ClickBtnloginWO();
        addpackagepage.clickpopupOK();
    }

    public void validateuserWO() {
        addpackagepage.setValidasiuserWO();
        addpackagepage.clickdropdown();
    }

    public void clickMyPackage() {
        addpackagepage.clickmyPackage();
    }

    public void validateMypackage() {
        addpackagepage.setValidasiPackage();
        addpackagepage.clickaddPackge();
    }

    public void validatenewPackage() {
        addpackagepage.setValidasiNewPackage();
    }

    public void inputformMandatory() {
        addpackagepage.setInputPackageName();
        addpackagepage.setInputPrice();
        addpackagepage.setInputPax();
        addpackagepage.setInputDescription();

    }

    public void uploadimg(String filename) {
        filename = filename.replaceAll("\"", "");
        addpackagepage.uploadFoto(filename);
    }

    public void clickSave() {
        addpackagepage.setSave();
    }

    public void clickpopupok() {
        addpackagepage.clickpopupok();
    }


}
