package starter.steps;

import starter.pages.registerUserPage;

public class RegisterUserSteps {
    registerUserPage registerUserPage;

    public void openHomePage(){
        registerUserPage.open();
    }
    public void openRegisterPage(){
        registerUserPage.clickButtonDaftar();
    }
    public void inputValidRegister(){
        registerUserPage.registerAccount();
    }
    public void clickSignUp(){
        registerUserPage.clickDaftarUser();
    }
    public void successSignUp(){
        registerUserPage.validasiDaftarUser();
    }
}
