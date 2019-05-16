package PageObjects;

import AppleMac.Utils;
import org.openqa.selenium.By;

public class BuyExtrasPage extends Utils {

    private By _imageHeader = By.cssSelector("[class='ir as-summaryheader-image']");
    private By _productTitle = By.cssSelector("[class='as-summaryheader-producttitle']");
    private By _reviewBagButton = By.cssSelector("span[class='label']");
    private By _buyUsbCToUsbAdapter = By.cssSelector("[data-autom='addToBag-usbCtousbGridGroup']");
    private By _itemAddedToBag = By.cssSelector("[id='usbCtousbGridGroup_async_labelledby']>div");
    private By _reviewBagPageHeading = By.cssSelector("[class='rs-bag-header']");

    // verify elements in header displayed and add USB-C to USB Adapter to bag
    public void verifyElementsPresentAndAddUsbAdapterToBag(){
        System.out.println("Location: buy extra items page");
        Utils.elementIsDisplayed(_imageHeader);
        Utils.verifyElementContainsText(_productTitle, "15-inch MacBook Pro - Silver");
        Utils.elementIsDisplayed(_reviewBagButton);
        System.out.println("All elements displayed");
        Utils.scrollUpOrDown(300);
        Utils.clickElementBy(_buyUsbCToUsbAdapter);
        Utils.waitForElementDisplay(_itemAddedToBag,5);
        Utils.verifyElementContainsText(_itemAddedToBag,"Item added to bag");
        System.out.println("Usb-c to USB Adapter added to bag successfullty");
        Utils.clickElementBy(_reviewBagButton);
    }

    public void verifyUserIsOnShoppingCartPage(){
        System.out.println("Loaction: Shopping cart page");
        Utils.assertTextOfElement("Here’s what’s in your bag.",_reviewBagPageHeading);
    }
}
