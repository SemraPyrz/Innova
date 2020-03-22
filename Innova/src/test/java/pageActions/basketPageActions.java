package pageActions;

import helpers.helpers;
import pageObjects.basketPageObject;
import utility.hooks;

public class basketPageActions extends hooks {

    public static void verifyMyBasketItem() throws Throwable {
        basketNameText = driver.findElements(basketPageObject.basketProductName).get(0).getText();
        helpers.compareTexts(nameText, basketNameText);
    }

}
