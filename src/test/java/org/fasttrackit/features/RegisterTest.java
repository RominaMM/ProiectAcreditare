package org.fasttrackit.features;


import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerAccount(){
        registerSteps.navigateMyAccountPage();
        registerSteps.typeValidRegisterUsername("rominamarctest2@mailinator.com");   //always change the email
        registerSteps.typeValidRegisterPassword("Proiect123456789");
        registerSteps.clickTheRegisterButton();
        registerSteps.checkIfLoggedIn("Hello rominamarctest2 (not rominamarctest2? Log out)");  // change the email
    }
}
