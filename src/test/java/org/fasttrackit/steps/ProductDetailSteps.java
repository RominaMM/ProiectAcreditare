package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductDetailPage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class ProductDetailSteps {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private ProductDetailPage productDetailPage;


    @Step
    public void navigateToSearchField() {
        homePage.open();
        homePage.clickOnSearchField();
    }

    @Step
    public void typeProductName(String product) {
        homePage.searchProduct(product);
    }

    @Step
    public void clickSearch() {
        homePage.clickOnSearchButton1();
    }

    @Step
    public void clickOnTheProduct() {
        searchResultsPage.navigateToProduct();
    }

    @Step
    public void checkIfClickedProduct(String expected) {
        String message = productDetailPage.getProductIndividualDetail("SKU: Woo-tshirt-logo");
        Assert.assertEquals(expected, message);
    }

    @Step
    public void stepsToAddProduct(){
        navigateToSearchField();
        typeProductName("shirt");
        clickSearch();
        clickOnTheProduct();
        checkIfClickedProduct("SKU: Woo-tshirt-logo");
    }

    @Step
    public void clickOnCartButton(){
        productDetailPage.selectViewCartHeaderOption();
    }
}
