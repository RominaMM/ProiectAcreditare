package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;


    @Step
    public void navigateMyAccountPage() {
        homePage.open();
        myAccountPage.clickOnHeaderLoginButton();}

     @Step
     public void typeValidUsername(String username){
        myAccountPage.clickOnUsernameField(username);}

     @Step
     public void typeValidPassword(String password) {
        myAccountPage.clickOnPasswordField(password);}

     @Step
     public void clickTheLoginButton(){
        myAccountPage.clickOnLoginButton();

    }
    @Step
    public void checkIfLoggedIn(String expected){
        String message = myAccountPage.getHelloMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkIfInvalidLogin(String expected){
        String message = myAccountPage.getInvalidEmailAddressMessage();
        Assert.assertEquals(expected, message);
    }


    @Step
    public void login(String username, String pass){
        navigateMyAccountPage();
        typeValidUsername(username);
        typeValidPassword(pass);
        clickTheLoginButton();


    }









}
