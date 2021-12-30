package starter.steps;

import net.thucydides.core.annotations.Steps;
import starter.pages.adminapprovePaymentPage;

public class adminapprovePaymentSteps {


    adminapprovePaymentPage adminapprovepaymentpage;

    public void openHomePage(){
        adminapprovepaymentpage.open();
    }
    public void clickAdmin(){
        adminapprovepaymentpage.clickAdmin();
    }
    public void inputvalidEmail(){
        adminapprovepaymentpage.setinputvalidEmail();
    }
    public void inputvalidPassword(){
        adminapprovepaymentpage.setinputvalidPassword();
    }
    public void clickSignin(){
        adminapprovepaymentpage.setSignin();
    }
    public void drpdownDashboard(){
        adminapprovepaymentpage.setDrpDwnDashboard();
    }
    public void ClickDashboard(){
        adminapprovepaymentpage.setDashboard();
    }
    public void validatelistpaymentUser(){
        adminapprovepaymentpage.setValidatelistpaymentUser();
    }
    public void drpdownPaymentUser(){
        adminapprovepaymentpage.setDrpdwnlistpaymentUser();
    }
    public void clickAccept(){
        adminapprovepaymentpage.setBtnAccept();
    }
    public void popUp(){
        adminapprovepaymentpage.setPopUp();
    }
}
