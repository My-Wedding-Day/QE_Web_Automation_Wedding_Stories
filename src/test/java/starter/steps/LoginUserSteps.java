package starter.steps;

import starter.pages.LoginUserPage;
import starter.pages.registerUserPage;

public class LoginUserSteps {
    LoginUserPage loginUserPage;

    public void openHomePage(){
        loginUserPage.open();
    }
    public void openLoginPage(){
        loginUserPage.clickButtonLogin();
    }
    public void inputValidLogin(){
        loginUserPage.loginAccount();
    }
    public void clickLogin(){
        loginUserPage.clickLoginUser();
    }
    public void successLogin(){
        loginUserPage.validasiLoginUser();
    }
}
