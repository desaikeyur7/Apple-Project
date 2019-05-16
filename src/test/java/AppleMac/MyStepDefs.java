package AppleMac;

import PageObjects.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    MacPage macPage = new MacPage();
    MacBookProPage macBookProPage = new MacBookProPage();
    BuyMacBookProPage buyMacBookProPage = new BuyMacBookProPage();
    BuyMacBookPro15InchPage buyMacBookPro15InchPage = new BuyMacBookPro15InchPage();
    BuyExtrasPage buyExtrasPage = new BuyExtrasPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("^the url ‘https://www\\.apple\\.com/uk/’$")
    public void the_url_https_www_apple_com_uk(){

    }

    @Given("^I go to url$")
    public void i_go_to_url() {

        homePage.verifyAllMenuLinksOnTopOfThePageAreDisplayed();
        homePage.verifyHeadingIsDisplayed();
        homePage.navigateToMacPage();
        homePage.verifyImacHeadingIsDisplayed();
    }

    @When("^I choose a MacBook Pro with the following features and accessories$")
    public void i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable arg1) {

        macPage.verifyProductIconsAndLabelsAreDisplayedOnTopOfPage();
        macPage.navigateToMacBookProPage();
        macPage.verifyHeadingAndSubHeadingIsDisplayed();
        macBookProPage.verifyLinksAndButtonDisplayedOnTopOfPage();
        macBookProPage.clickOnBuyButton();
        macBookProPage.verifyBuyMacBookProPageTitle();
        buyMacBookProPage.verifyLinksDisplayedOnTopOfPage();
        buyMacBookProPage.verifyAppleTradeUpBannerComponentsAreDisplayed();
        buyMacBookProPage.verifyProductSelectionButtonsAreDisplayed();
        buyMacBookProPage.select15InchMacBookProToBuy();
        buyMacBookPro15InchPage.verifyElementsInStickyBoxAtBottomOfPageAreDisplayed();
        buyMacBookPro15InchPage.verifyOptionsAndSpecificationsAreDisplayed();
        buyMacBookPro15InchPage.selectOptionsAndSpecificationsAndAddMacBookProToCart();
        buyMacBookPro15InchPage.verifyUserIsOnBuyExtrasPage();
        buyExtrasPage.verifyElementsPresentAndAddUsbAdapterToBag();
        buyExtrasPage.verifyUserIsOnShoppingCartPage();
    }

    @Then("^I can place an order for it$")
    public void i_can_place_an_order_for_it(){
        shoppingCartPage.verifyAllElementsAreDisplayed();
        shoppingCartPage.clickOnCheckoutToBuySelectedProducts();
    }

    @Given("^when I choose the following items:$")
    public void when_I_choose_the_following_items(DataTable arg1) {
        homePage.navigateToMacPage();
        macPage.navigateToMacBookProPage();
        macBookProPage.clickOnBuyButton();
        buyMacBookProPage.select15InchMacBookProToBuy();
        buyMacBookPro15InchPage.selectOptionsAndSpecificationsAndAddMacBookProToCart();
        buyExtrasPage.verifyElementsPresentAndAddUsbAdapterToBag();
    }

    @When("^I proceed to the checkout$")
    public void i_proceed_to_the_checkout() {
        shoppingCartPage.verifyAllElementsAreDisplayed();
    }

    @Then("^a total price of £(\\d+)\\.(\\d+) will be displayed$")
    public void a_total_price_of_£_will_be_displayed(int arg1, int arg2) {
        shoppingCartPage.verifyTotalAmoutIsDiaplayed();
    }

    @Then("^£(\\d+)\\.(\\d+) will be listed for VAT\\.VAT$")
    public void £_will_be_listed_for_VAT_VAT(int arg1, int arg2) {
        shoppingCartPage.verifyVatAmountIsDiaplayed();
    }

}
