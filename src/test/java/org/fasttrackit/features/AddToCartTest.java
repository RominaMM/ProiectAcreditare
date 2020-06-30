package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToCartSteps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductDetailSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class AddToCartTest extends BaseTest {
    @Steps
    private AddToCartSteps addToCartSteps;
    @Steps
    private ProductDetailSteps productDetailSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addToCartProductFromDetailPage(){
        addToCartSteps.navigateToSearchField();
        addToCartSteps.typeProductName("shirt");
        addToCartSteps.clickSearch();
        addToCartSteps.clickOnTheProduct();
        addToCartSteps.checkIfClickedProduct("SKU: Woo-tshirt-logo");
        addToCartSteps.addProductToCart();
        addToCartSteps.checkIfAddedToCartMessage("\"“T-Shirt with Logo” has been added to your cart.\"");
    }

    @Test
    public void addProductToCartFromProductDetailsPage(){

        loginSteps.login("rominamarctest@mailinator.com","Proiect123456789");
        productDetailSteps.stepsToAddProduct();
        productDetailSteps.clickOnCartButton();
        cartSteps.verifyIfCartPage();
        cartSteps.checkCartList();
        cartSteps.verifyProductInCart("T-Shirt with Logo");


    }
}
