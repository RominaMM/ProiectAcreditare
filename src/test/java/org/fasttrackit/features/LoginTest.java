package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginValidAccount(){

        loginSteps.navigateMyAccountPage();
        loginSteps.typeValidUsername("rominamarctest@mailinator.com");
        loginSteps.typeValidPassword("Proiect123456789");
        loginSteps.clickTheLoginButton();
        loginSteps.checkIfLoggedIn("Hello rominamarctest (not rominamarctest? Log out)");
    }
    @Test
    public void loginInvalidAccount(){

        loginSteps.navigateMyAccountPage();
        loginSteps.typeValidUsername("rominamarct@mailinator.com");
        loginSteps.typeValidPassword("Proiect123456789");
        loginSteps.clickTheLoginButton();
        loginSteps.checkIfInvalidLogin("ERROR: Invalid email address. Lost your password?");
    }
}
