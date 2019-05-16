package PageObjects;

import AppleMac.Utils;
import org.openqa.selenium.By;

public class BuyMacBookProPage extends Utils {

    private By _macBookProHyperlink = By.cssSelector(".localnav-header>a[href='https://www.apple.com/uk/macbook-pro']");
    private By _overviewLink = By.cssSelector("[data-display-name='Overview']");
    private By _macOsLink = By.cssSelector("[data-display-name='macOS']");
    private By _techSpecsLink = By.cssSelector("[data-display-name='Tech Specs']");
    private By _tradeUpBanner = By.cssSelector(".as-tradeupbanner-header>span[class='as-tradeupbanner-initial']");
    private By _appleTradeUpMessage = By.cssSelector(".as-tradeupbanner-message>span[class='as-tradeupbanner-initial']");
    private By _getStartedButton = By.cssSelector("[class*='tradeupbanner-button']");
    private By _13InchButton = By.cssSelector("[data-toggle-key='13inch']");
    private By _15InchMacBookProImage = By.cssSelector("[class='as-macbtr-options as-bundleselection-modelshown acc_MR942B/A']");
    private By _15InchButton = By.cssSelector("[data-toggle-key='15inch']");
    private By _colourSilver15Inch512Gb = By.cssSelector("[for='colorOptionGridGroup_MR972B/A']");
    private By _selectButton15Inch512Gb = By.xpath("(//*[contains(text(),'Select')])[19]");
    private By _15Inch512GbItemDescription = By.cssSelector("[class*='acc_MR942B/A rs-noAnimation']");
    private By _macBookProProductHeading = By.cssSelector("[class='as-configuration-maintitle']");

    // This method will check all the links on top of page are displayed
    public void verifyLinksDisplayedOnTopOfPage(){
        Utils.webElementDisplayed(_macBookProHyperlink);
        Utils.webElementDisplayed(_overviewLink);
        Utils.webElementDisplayed(_macOsLink);
        Utils.webElementDisplayed(_techSpecsLink);
    }

    // This method will check all the elements of Apple trade up component are displayed correctly
    public void verifyAppleTradeUpBannerComponentsAreDisplayed(){
        Utils.verifyElementContainsText(_tradeUpBanner, "Add a trade-in");
        Utils.verifyElementContainsText(_appleTradeUpMessage, "Get a refund of up to £700 when you trade in an eligible computer, or recycle it for free.**");
        Utils.waitForElementToBeClickable(_getStartedButton,2);
    }

    // This method will check the toggle button for 13" and 15" are displayed correctly
    public void verifyProductSelectionButtonsAreDisplayed()
    {
        Utils.webElementDisplayed(_13InchButton);
        Utils.webElementDisplayed(_15InchButton);
        System.out.println("All elements displayed correctly");
    }

    // This method will call all the methods in this class and will select 15 inch Macbook pro to buy
    public void select15InchMacBookProToBuy(){
        Utils.webElementDisplayed(_15InchMacBookProImage);
        Utils.clickElementBy(_15InchButton);
        Utils.scrollAndClickOnElement(_colourSilver15Inch512Gb, 5);
        Utils.verifyElementContainsText(_15Inch512GbItemDescription, "2.6GHz 6-Core Processor");
        Utils.scrollUpOrDown(800);
        Utils.waitForElementDisplay(_selectButton15Inch512Gb, 5);
        Utils.moveToElementAndClick(_selectButton15Inch512Gb);
        Utils.assertTextOfElement("Customise your 15‑inch MacBook Pro - Silver", _macBookProProductHeading);
    }
}
