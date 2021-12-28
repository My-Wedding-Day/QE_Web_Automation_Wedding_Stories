package starter.steps;

import starter.pages.ProfileUserPage;

public class ProfileUserSteps {
    ProfileUserPage profileUserPage;
    public void openHomePage(){
        profileUserPage.open();
    }
    public void iconWebsite(){
        profileUserPage.clicklogoWeb();
    }
    public void openLoginPage(){
        profileUserPage.setBtnMasuk();
    }
    public void inputvalidEmail(){
        profileUserPage.setInputfieldEmail();
    }
    public void inputvalidPassword(){
        profileUserPage.setInputfieldPassword();
    }
    public void clickButtonLogin(){
        profileUserPage.setBtnSignin();
    }
    public void validateUsername(){
        profileUserPage.setValidateUsername();
    }
    public void CLickProfile(){
        profileUserPage.setDrpDwnProfile();
    }

    public void clickbtnProfileUser(){
        profileUserPage.setProfileUser();
    }
    public void validateUsernameProfile(){
        profileUserPage.setValidateProfileUser();
    }

}
