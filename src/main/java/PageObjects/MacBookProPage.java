package PageObjects;

import AppleMac.Utils;
import org.openqa.selenium.By;

public class MacBookProPage extends Utils {

    private By _macBookProHyperlink = By.cssSelector("[href='/uk/macbook-pro/']");
    private By _overviewLink = By.cssSelector("[class='ac-ln-menu-link current']");
    private By _macOsLink = By.cssSelector("[href='/uk/macbook-pro/macos/']");
    private By _techSpecsLink = By.cssSelector("[href='/uk/macbook-pro/specs/']");
    private By _buyButton = By.cssSelector("[href='/uk/shop/goto/macbook_pro/select']");

    public void verifyLinksAndButtonDisplayedOnTopOfPage(){
        Utils.webElementDisplayed(_macBookProHyperlink);
        Utils.webElementDisplayed(_overviewLink);
        Utils.webElementDisplayed(_macOsLink);
        Utils.webElementDisplayed(_techSpecsLink);
        Utils.webElementDisplayed(_buyButton);
        System.out.println("All elements on MacBook pro page displayed correctly");
    }

    public void clickOnBuyButton(){
        Utils.clickElementBy(_buyButton);
    }

    public void verifyBuyMacBookProPageTitle(){
        System.out.println("Location: Buy MacBook Pro Page");
        Utils.verifyPageTitle("Buy MacBook Pro - Apple (UK)");
    }
}
