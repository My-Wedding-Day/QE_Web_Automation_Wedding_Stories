package starter.steps;

import starter.pages.RegisterWoPage;

public class RegisterWOSteps {
    RegisterWoPage registerWoPage;

    public void openHomePage() {
        registerWoPage.open();
    }

    public void openWeddingStoriesPage() {
        registerWoPage.clickIconVirus();
    }

    public void openRegisterPage() {
        registerWoPage.clickbuttonDaftar();
    }

    public void ClickRegisterWOPage() {
        registerWoPage.clickbuttonsignupWO();
    }

    //REGISTER
    public void inputvalidBussinessName() {
        registerWoPage.setInputFieldBussinessName();
    }

    public void inputInvalidBussinessName(String InvalidBussinessName) {
        registerWoPage.setInputFieldBussinessName(InvalidBussinessName);
    }

    public void validEmail() {
        registerWoPage.setInputFieldEmail();
    }

    public void InvalidEmail(String InvalidEmail) {
        registerWoPage.setInputFieldEmail(InvalidEmail);
    }

    public void inputAddress() {
        registerWoPage.setInputAddress();
    }

    public void chooseCity() {
        registerWoPage.setChooseCity();
    }

    public void inputPhoneNumber(String PhoneNumber) {
        registerWoPage.setInputPhoneNumber(PhoneNumber);
    }
    public void inputPassword(String Password){
        registerWoPage.setInputPassword(Password);
    }

    public void clickBtnRegister() {
        registerWoPage.setBtnRegister();
    }
    public void validatePopUp(){
        registerWoPage.setValidatePopUp();
    }
}
