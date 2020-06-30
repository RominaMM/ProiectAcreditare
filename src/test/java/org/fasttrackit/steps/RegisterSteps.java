package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateMyAccountPage() {
        homePage.open();
        myAccountPage.clickOnHeaderLoginButton();}

    @Step
    public void typeValidRegisterUsername(String username){    //always change the email
        myAccountPage.clickOnRegisterUsernameField("rominamarctest2@mailinator.com");}

    @Step
    public void typeValidRegisterPassword(String password) {
        myAccountPage.clickOnRegisterPasswordField("Proiect123456789");}

    @Step
    public void clickTheRegisterButton(){
        myAccountPage.clickOnRegisterButton();
    }

    @Step
    public void clickTheLoginButton(){
        myAccountPage.clickOnLoginButton();

    }
    @Step
    public void checkIfLoggedIn(String expected){
        String message = myAccountPage.getHelloMessage();
        Assert.assertEquals(expected, message);
    }
}
