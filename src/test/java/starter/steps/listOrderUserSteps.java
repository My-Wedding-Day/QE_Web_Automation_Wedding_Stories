package starter.steps;

import starter.pages.listOrderUserPage;

public class listOrderUserSteps {

    listOrderUserPage listorderuserpage;

    public void openHomePage() {
        listorderuserpage.open();
    }

    public void openLoginPage() {
        listorderuserpage.ClickSignIn();
    }

    public void inputvalidEmailPassword() {
        listorderuserpage.setInputValidEmail();
        listorderuserpage.setInputValidPassword();
    }

    public void clickLogin() {
        listorderuserpage.clickbtnlogin();
    }

    public void successLogin() {
        listorderuserpage.setValidateUser();
    }

    public void ClickDrpDwn(){
        listorderuserpage.setDrpDwnHistory();
    }


    public void ViewHistoryOrder() {
        listorderuserpage.clickbtnHistory();
    }

    public void successViewHistory() {
        listorderuserpage.setValidateHistory();
    }
}
