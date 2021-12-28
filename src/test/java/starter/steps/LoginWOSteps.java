package starter.steps;

import starter.pages.LoginWOPage;

public class LoginWOSteps {
    LoginWOPage loginWOPage;

    public void openHomepage() {
        loginWOPage.open();
    }

    public void IconWebsite() {
        loginWOPage.clickIconVirus();
    }

    public void openSigninpage() {
        loginWOPage.clickbuttonMasuk();
    }
    public void ClickbuttonSignWO(){
        loginWOPage.clickbuttonsigninWO();
    }
    //login
    public void inputvalidEmail(){
        loginWOPage.setInputFieldEmail();
    }
    public void  inputInvalidEmail(String invalidemail){
        loginWOPage.setInputInvalidEmail(invalidemail);
    }
    public void inputvalidPassword(){
        loginWOPage.setInputFieldPassword();
    }
    public void inputInvalidPassword(String invalidpassword){
        loginWOPage.setnputInvalidPassword(invalidpassword);
    }
    public void OpenProfileWO(){
        loginWOPage.setClickBtnLoginWO();
    }
    public void validateUsernameWO(){
        loginWOPage.setValidateUsername();
    }
    public void validateAlertEmail(){
        loginWOPage.setvalidateAlertEmail();
    }
    public void validateAlertFieldEmailEmpty(){
        loginWOPage.setValidateAlertFieldEmailEmpty();
    }
    public void validateAlertFieldPasswordEmpty(){
        loginWOPage.setValidateAlertFieldPasswordEmpty();
    }
}
