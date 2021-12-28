package starter.steps;

import starter.pages.paymentUserPage;

public class paymentUserSteps {

    paymentUserPage paymentuserpage;

    public void openHomePage(){
        paymentuserpage.open();
    }
    public void iconWebsite(){
        paymentuserpage.clicklogoWeb();
    }
    public void openLoginPage(){
        paymentuserpage.setBtnMasuk();
    }
    public void inputvalidEmail(){
        paymentuserpage.setInputfieldEmail();
    }
    public void inputvalidPassword(){
        paymentuserpage.setInputfieldPassword();
    }
    public void clickButtonLogin(){
        paymentuserpage.setBtnSignin();
    }
    public void validateUsername(){
        paymentuserpage.setValidateUsername();
    }
    public void CLickHistory(){
        paymentuserpage.setDrpDwn();
    }

    public void clickbtnHistory(){
        paymentuserpage.setHistory();
    }
    public void validateUsernameProfile(){
        paymentuserpage.setValidateProfileWO();
    }

}


