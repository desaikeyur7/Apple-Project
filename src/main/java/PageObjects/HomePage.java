package PageObjects;

import AppleMac.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _appleIcon = By.cssSelector(".ac-gn-list>li>a[href='/uk/']");
    private By _macLink = By.cssSelector("[class='ac-gn-link ac-gn-link-mac']");
    private By _ipadLink = By.cssSelector("[class='ac-gn-link ac-gn-link-ipad']");
    private By _iphoneLink = By.cssSelector("[class='ac-gn-link ac-gn-link-iphone']");
    private By _watchLink =  By.cssSelector("[class='ac-gn-link ac-gn-link-watch']");
    private By _tvLink = By.cssSelector("[class='ac-gn-link ac-gn-link-tv']");
    private By _musicLink = By.cssSelector("[class='ac-gn-link ac-gn-link-music']");
    private By _supportLink = By.cssSelector("[class='ac-gn-link ac-gn-link-support']");
    private By _searchLink = By.cssSelector("[class='ac-gn-link ac-gn-link-search']");
    private By _shoppingBagLink = By.cssSelector("[id='ac-gn-bag']>a");
    private By _heading = By.cssSelector("[class='copy-wrapper']>h2");
    private By _imacHeading = By.cssSelector(".section-imac>div>h2[class='product-eyebrow typography-callout']");

    public void verifyAllMenuLinksOnTopOfThePageAreDisplayed(){
        System.out.println("Location: On Homepage");
        Utils.webElementDisplayed(_appleIcon);
        Utils.webElementDisplayed(_macLink);
        Utils.webElementDisplayed(_ipadLink);
        Utils.webElementDisplayed(_iphoneLink);
        Utils.webElementDisplayed(_watchLink);
        Utils.webElementDisplayed(_tvLink);
        Utils.webElementDisplayed(_musicLink);
        Utils.webElementDisplayed(_supportLink);
        Utils.webElementDisplayed(_searchLink);
        Utils.webElementDisplayed(_shoppingBagLink);
        System.out.println("All elements on top of page displayed correctly");
    }

    public void verifyHeadingIsDisplayed(){
        Utils.waitForElementDisplay(_heading,5);
        Utils.webElementDisplayed(_heading);
    }

    public void navigateToMacPage(){
        Utils.clickElementBy(_macLink);
    }

    public void verifyImacHeadingIsDisplayed(){

        System.out.println("Location: On Mac Page");
        Utils.assertTextOfElement("iMac", _imacHeading);
    }


}
