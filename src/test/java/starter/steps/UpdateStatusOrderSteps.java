package starter.steps;

import starter.pages.UpdateStatusOrderPage;

public class UpdateStatusOrderSteps {

    UpdateStatusOrderPage updatestatusorderpage;

    public void openHomepage() {

        updatestatusorderpage.open();
    }

    public void IconWebsite() {
        updatestatusorderpage.clickweb();
    }

    public void openSigninpage() {

        updatestatusorderpage.clickbuttonMasuk();
    }

    public void ClickbuttonSignWO() {
        updatestatusorderpage.clickbuttonsigninWO();
    }

    //login
    public void inputvalidEmail() {
        updatestatusorderpage.setInputFieldEmail();
    }

    public void inputvalidPassword() {
        updatestatusorderpage.setInputFieldPassword();
    }

    public void OpenProfileWO() {
        updatestatusorderpage.setClickBtnLoginWO();
    }

    public void validateUsernameWO() {
        updatestatusorderpage.setValidateUsername();
    }
    public void clickpopUp(){
        updatestatusorderpage.clickpopupWO();
    }
    public void drpDwnlist(){
        updatestatusorderpage.setDrpDownOrderList();
    }
    public void clickorderList(){
        updatestatusorderpage.clickorderlist();
    }
    public void validateorder(){
        updatestatusorderpage.setValidateOrder();
    }
    public void detailPackage(){
        updatestatusorderpage.setDetailPackge();
    }
    public void clickAccept(){
        updatestatusorderpage.setAcceptOrder();
    }
    public void clickpopupyes(){
        updatestatusorderpage.clickPopUpAccept();
    }

}
