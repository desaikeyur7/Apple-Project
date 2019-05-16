package PageObjects;

import AppleMac.Utils;
import org.openqa.selenium.By;

public class MacPage extends Utils {

    private By _macBookIconLabel = By.cssSelector(".chapternav-items>li>a[href='/uk/macbook/']");
    private By _macBookAirIconLabel = By.cssSelector(".chapternav-item-macbook-air>a[href='/uk/macbook-air/']");
    private By _macBookProIconLabel = By.cssSelector(".chapternav-item-macbook-pro>a[href='/uk/macbook-pro/']");
    private By _imacIconLabel = By.cssSelector(".chapternav-item-imac>a[href='/uk/imac/']");
    private By _imacProIconLabel = By.cssSelector(".chapternav-item-imac-pro>a[href='/uk/imac-pro/']");
    private By _macProIconLabel = By.cssSelector(".chapternav-item-mac-pro>a[href='/uk/mac-pro/']");
    private By _imacMiniIconLabel = By.cssSelector(".chapternav-item-mac-mini>a[href='/uk/mac-mini/']");
    private By _accessoriesIconLabel = By.cssSelector(".chapternav-item-accessories>a[href='/uk/shop/goto/mac/accessories']");
    private By _macOsMojaveIconLabel = By.cssSelector(".chapternav-item-macos>a[href='/uk/macos/mojave/']");
    private By _compareIconLabel = By.cssSelector(".chapternav-item-compare>a[href='/uk/mac/compare/']");
    private By _macBookProHeading = By.cssSelector(".hero-copy>h1[class='typography-eyebrow-elevated']");
    private By _subHeading = By.cssSelector(".hero-copy>h2[class='typography-headline-elevated']");

    public void verifyProductIconsAndLabelsAreDisplayedOnTopOfPage(){
        Utils.webElementDisplayed(_macBookIconLabel);
        Utils.webElementDisplayed(_macBookAirIconLabel);
        Utils.webElementDisplayed(_macBookProIconLabel);
        Utils.webElementDisplayed(_imacIconLabel);
        Utils.webElementDisplayed(_imacProIconLabel);
        Utils.webElementDisplayed(_macProIconLabel);
        Utils.webElementDisplayed(_imacMiniIconLabel);
        Utils.webElementDisplayed(_accessoriesIconLabel);
        Utils.webElementDisplayed(_macOsMojaveIconLabel);
        Utils.webElementDisplayed(_compareIconLabel);
        System.out.println("All elements on top page diaplayed correctly");
    }

    public void navigateToMacBookProPage(){
        Utils.clickElementBy(_macBookProIconLabel);
    }

    public void verifyHeadingAndSubHeadingIsDisplayed(){
        System.out.println("Location: Macbook Pro Page");
        Utils.waitForElementDisplay(_macBookProHeading, 10);
        Utils.assertTextOfElement("MacBook Pro", _macBookProHeading);
        Utils.assertTextOfElement("More power.\n" + "More performance.\n" + "More pro.", _subHeading);
    }
}
