package PageObjects;

import AppleMac.Utils;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {

    private By _freeDeliveryText = By.cssSelector("[class='rs-bag-middlexmerch']");

    // MacBook link and price in basket
    private By _15InchMacBookProLink = By.cssSelector("[data-s-object-id='cb206daafd789c1bf956110615d8157f']");
    private By _macBookProTotalPrice = By.xpath("(//*[contains(text(),'3,168.99')])[1]");

    // Additional product
    private By _appleCareText = By.cssSelector("h3[aria-label*='Add AppleCare+']");
    private By _appleCareAddButton = By.xpath("(//*[contains(text(),'Add')])[3]");

    // USB-C to USB adapter in basket
    private By _usbcToUsbAdapterLink = By.cssSelector("[data-s-object-id='9d2ff0d8d1cf98e3252eb3e545cd071e']");
    private By _usbcToAdapterPrice = By.xpath("(//*[@data-autom='bag-item-totalprice'])[2]");

    // subtotal, shipping cost, promocode, VAT ans total amount
    private By _subtotalText = By.cssSelector("div[data-autom='bagrs-summary-subtotallabel']");
    private By _subtotalAmount = By.cssSelector("div[data-autom='bagrs-summary-subtotalvalue']");
    private By _promocodeText = By.xpath("(//*[contains(text(),'Have a promo code?')])[2]");
    private By _totalAmountText = By.cssSelector("[data-autom='bagrs-summary-totallabel']");
    private By _totalAmount = By.cssSelector("[data-autom='bagrs-summary-totalvalue']");
    private By _vatTextAndAmount = By.cssSelector("div[class='rs-tax-section']");
    private By _financeOptionsLink = By.cssSelector("[id='rs-financingOptions-overlay']");
    private By _checkoutButton = By.cssSelector("[id='shoppingCart.actions.checkout']");

    // Sign in Page Header
    private By _pleaseSignInText = By.cssSelector("[class='as-l-container rs-signin-header']");
    private By _guestCheckoutText = By.cssSelector("[class='rs-guestcheckout-header']");

    public void verifyAllElementsAreDisplayed(){
       Utils.elementIsDisplayed(_freeDeliveryText);
       Utils.elementIsDisplayed(_15InchMacBookProLink);
       Utils.elementIsDisplayed(_macBookProTotalPrice);
       Utils.elementIsDisplayed(_appleCareText);
       Utils.elementIsDisplayed(_appleCareAddButton);
       Utils.elementIsDisplayed(_usbcToUsbAdapterLink);
       Utils.elementIsDisplayed(_usbcToAdapterPrice);
       Utils.elementIsDisplayed(_subtotalText);
       Utils.elementIsDisplayed(_subtotalAmount);
       Utils.elementIsDisplayed(_promocodeText);
       Utils.elementIsDisplayed(_totalAmountText);
       Utils.elementIsDisplayed(_totalAmount);
       Utils.elementIsDisplayed(_vatTextAndAmount);
       Utils.elementIsDisplayed(_financeOptionsLink);
       Utils.elementIsDisplayed(_checkoutButton);
        System.out.println("All elements are displayed");
    }

    public void clickOnCheckoutToBuySelectedProducts(){
        Utils.scrollAndClickOnElement(_checkoutButton,10);
    }

    public void verifyUserIsOnSignInGuestCheckoutPage(){
        System.out.println("Location: Sign In/Guest Checkout page");
        Utils.assertTextOfElement("Please sign in.", _pleaseSignInText);
        Utils.assertTextOfElement("Guest Checkout", _guestCheckoutText);
    }

    public void verifyTotalAmoutIsDiaplayed(){
        Utils.assertTextOfElement("£3,187.99",_totalAmount);
    }

    public void verifyVatAmountIsDiaplayed(){
        Utils.assertTextOfElement("Includes VAT of £531.34",_vatTextAndAmount);
    }
}
