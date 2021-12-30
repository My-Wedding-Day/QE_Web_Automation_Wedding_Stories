package starter.steps;

import starter.pages.deletePackagePage;

public class deletePackageSteps {
    deletePackagePage deletepackagpage;

    public void openHomePage() {
        deletepackagpage.open();
    }

    public void openLoginPage() {
        deletepackagpage.clickbtnSignIn();
    }

    public void ClickSignInWO() {
        deletepackagpage.clickbtnSignInWO();
    }

    public void validEmailPasword() {
        deletepackagpage.setInputvalidEmail();
        deletepackagpage.setInputvalidPassword();
    }

    public void ClickbtnLogIn() {
        deletepackagpage.ClickBtnloginWO();
        deletepackagpage.clickpopupOK();
    }

    public void validateuserWO() {
        deletepackagpage.setValidasiuserWO();
        deletepackagpage.clickdropdown();
    }

    public void clickMyPackage() {
        deletepackagpage.clickmyPackage();
    }

    public void validateMypackage() {
        deletepackagpage.setValidasiPackage();
    }
    public void deletePackage(){
        deletepackagpage.setDeletePackage();
    }
    public void clickPopup(){
        deletepackagpage.setPopupYes();
    }
}
