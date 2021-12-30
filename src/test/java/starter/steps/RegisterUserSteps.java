package starter.steps;

import starter.pages.registerUserPage;

public class RegisterUserSteps {
    registerUserPage registeruserpage;

    public void openHomePage(){
        registeruserpage.open();

    }
    public void openRegisterPage(){
        registeruserpage.clickButtonDaftar();
    }
    public void inputValidRegister(){
        registeruserpage.registerAccount();
    }
    public void clickSignUp(){
        registeruserpage.clickDaftarUser();
    }
    public void successSignUp(){
        registeruserpage.validasiDaftarUser();
    }
}
