package starter.steps;

import starter.pages.UserCreateReservationPage;

public class UserCreateReservationSteps {
    UserCreateReservationPage usercreatereservationpage;

    public void openHomepage(){
        usercreatereservationpage.open();
    }

    public void openLoginPage(){
        usercreatereservationpage.ClickSignIn();
    }
    public void inputvalidEmailPassword(){
        usercreatereservationpage.setInputValidEmail();
        usercreatereservationpage.setInputValidPassword();
    }
    public void clickbtnLogin(){
        usercreatereservationpage.clickbtnlogin();
    }
    public void validateUser(){
        usercreatereservationpage.setValidateUser();
    }
    public void clickPackage(){
        usercreatereservationpage.clickPackage();
    }

    public void validateWO(){
        usercreatereservationpage.setValidateWO();
    }
    public void inputPax(){
        usercreatereservationpage.setInputCustomPax();
    }
    public void chooseDate(){usercreatereservationpage.setChooseDate();}
    public void selectDate(){
        usercreatereservationpage.setSelectDate();
    }
    public void inputDescription(){
        usercreatereservationpage.setInputText();
    }
    public void clickOrder(){
        usercreatereservationpage.clickOrder();
    }
}
