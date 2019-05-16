package PageObjects;

import AppleMac.Utils;
import org.openqa.selenium.By;

public class BuyMacBookPro15InchPage extends Utils {

    private By _chatnowLink = By.cssSelector("[class='as-chat-button active as-buttonlink']");
    private By _checkAvailabilityLink = By.cssSelector("[class*='retail-availability-search-trigger']");
    private By _deliveryOptionsLink = By.cssSelector("[data-autom='deliveryDateChecker']");
    private By _financeOptionsLink = By.cssSelector("[href='/uk/shop/go/finance']");
    private By _addToBagButton = By.cssSelector("[value='add-to-cart']");

    // Product image on left and all locators under MacBook Pro to customise the purchase
    private By _macBookProImage = By.cssSelector("[data-max-height*='stickybox-stop']");

    //processor title and options
    private By _titleProcessor = By.cssSelector(".as-configuration-selectionarea >div:nth-child(1) > div:nth-of-type(1) > h3 > span");
    private By _2_6GhzProcessor = By.xpath("(//*[contains(text(),'2.6GHz 6-core 8th-generation Intel')])[2]");
    private By _2_9GhzProcessor = By.xpath("//*[contains(text(),'2.9GHz 6-core 8th-generation Intel Core i9 processor')][1]");

    // Memory title and options
    private By _titleMemory = By.cssSelector(".as-configuration-selectionarea >div:nth-child(1) > div:nth-of-type(2) > h3 > span");
    private By _16GbMemory = By.xpath("(//*[contains(text(),'16GB 2400MHz DDR4 memory')])[2]");
    private By _32GbMemory = By.xpath("(//*[contains(text(),'32GB 2400MHz DDR4 memory')])[1]");

    // Graphics title and options
    private By _titleGraphics = By.cssSelector(".as-configuration-selectionarea >div:nth-child(1) > div:nth-of-type(3) > h3 > span");
    private By _radeon560XGraphics = By.xpath("(//*[contains(text(),'Radeon Pro 560X with 4GB of GDDR5 memory')])[2]");
    private By _radeonVega16Graphics = By.xpath("(//*[contains(text(),'Radeon Pro Vega 16 with 4GB of HBM2 memory')])[1]");
    private By _radeonVega20Graphics = By.xpath("(//*[contains(text(),'Radeon Pro Vega 20 with 4GB of HBM2 memory')])[1]");

    // Storage title and options
    private By _titleStorage = By.cssSelector(".as-configuration-selectionarea >div:nth-child(1) > div:nth-of-type(4) > h3 > span");
    private By _512GbStorage = By.xpath("(//*[contains(text(),'512GB SSD storage')])[2]");
    private By _1TbStorage = By.xpath("(//*[contains(text(),'1TB SSD storage')])[1]");
    private By _2TbStorage = By.xpath("(//*[contains(text(),'2TB SSD storage')])[1]");
    private By _4TbStorage = By.xpath("(//*[contains(text(),'4TB SSD storage')])[1]");

    // Keyboard language title and dropdown
    private By _titleKeyboardLanguage = By.cssSelector(".as-configuration-selectionarea >div:nth-child(1) > div:nth-of-type(5) > h3 > span");
    private By _dropdownkeyboardlanguage = By.id("option.keyboard_and_documentation_z0v3");

    // Pre Installed Software title
    private By _titlePreInstalledSoftware = By.cssSelector(".as-configuration-selectionarea >div:nth-child(2) >h2");

    // Final Cut title under Pre installed software and options
    private By _titleFinalCutProX = By.cssSelector(".as-configuration-selectionarea >div:nth-child(2) > div:nth-of-type(1) > h3 > span");
    private By _finalCutOptionNone = By.xpath("(//*[contains(text(),'None')])[1]");
    private By _finalCutOptionProX = By.xpath("(//*[contains(text(),'Final Cut Pro')])[2]");

    // Logic Pro title under Pre installed software and options
    private By _titleLogicProX = By.cssSelector(".as-configuration-selectionarea >div:nth-child(2) > div:nth-of-type(2) > h3 > span");
    private By _logicProOptionNone = By.xpath("(//*[contains(text(),'None')])[2]");
    private By _logicProOptionProX = By.cssSelector("[data-autom='optionSelector-sw_logic_pro_x_z0v3_065_c29h_2']>div>div");

    // Review Bag page
    private By _buyExtrasPageHeading = By.cssSelector("[class='column large-12 small-12 rs-attach-header rs-attach-mainheader']>h1");

    // This method will check all elements in the sticky bar at bottom of page are displayed
    public void verifyElementsInStickyBoxAtBottomOfPageAreDisplayed(){
        System.out.println("Location: Buy 15 inch MacBook Pro Page");
        Utils.elementIsDisplayed(_chatnowLink);
        Utils.elementIsDisplayed(_checkAvailabilityLink);
        Utils.elementIsDisplayed(_deliveryOptionsLink);
        Utils.elementIsDisplayed(_financeOptionsLink);
        Utils.elementIsDisplayed(_addToBagButton);
        System.out.println("All elements in Sticky box displayed correctly");
    }

    public void verifyOptionsAndSpecificationsAreDisplayed(){
        Utils.elementIsDisplayed(_macBookProImage);
        Utils.elementIsDisplayed(_titleProcessor);
        Utils.elementIsDisplayed(_2_6GhzProcessor);
        Utils.elementIsDisplayed(_2_9GhzProcessor);
        Utils.elementIsDisplayed(_titleMemory);
        Utils.elementIsDisplayed(_16GbMemory);
        Utils.elementIsDisplayed(_32GbMemory);
        Utils.elementIsDisplayed(_titleGraphics);
        Utils.elementIsDisplayed(_radeon560XGraphics);
        Utils.elementIsDisplayed(_radeonVega16Graphics);
        Utils.elementIsDisplayed(_radeonVega20Graphics);
        Utils.elementIsDisplayed(_titleStorage);
        Utils.elementIsDisplayed(_512GbStorage);
        Utils.elementIsDisplayed(_1TbStorage);
        Utils.elementIsDisplayed(_2TbStorage);
        Utils.elementIsDisplayed(_4TbStorage);
        Utils.elementIsDisplayed(_titleKeyboardLanguage);
        Utils.elementIsDisplayed(_dropdownkeyboardlanguage);
        Utils.elementIsDisplayed(_titlePreInstalledSoftware);
        Utils.elementIsDisplayed(_titleFinalCutProX);
        Utils.elementIsDisplayed(_finalCutOptionNone);
        Utils.elementIsDisplayed(_finalCutOptionProX);
        Utils.elementIsDisplayed(_titleLogicProX);
        Utils.elementIsDisplayed(_logicProOptionNone);
        Utils.elementIsDisplayed(_logicProOptionProX);
    }

    /* This method will select all relevant options and specifications mentioned in
    acceptance criteria and will add product to cart
     */

    public void selectOptionsAndSpecificationsAndAddMacBookProToCart(){
        Utils.scrollAndClickOnElement(_2_9GhzProcessor,5);
        Utils.scrollAndClickOnElement(_16GbMemory,5);
        Utils.scrollUpOrDown(1000);
        Utils.waitForElementDisplay(_logicProOptionProX,10);
        Utils.moveToElementAndClick(_logicProOptionProX);
        Utils.clickElementBy(_addToBagButton);
    }

    public void verifyUserIsOnBuyExtrasPage(){
        System.out.println("Location: Buy extras page");
        Utils.waitForElementDisplay(_buyExtrasPageHeading,5);
        Utils.assertTextOfElement("All the essentials. And then some.", _buyExtrasPageHeading);
    }
}
