package pageActions;

import helpers.helpers;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.homePageObject;
import pageObjects.productPageObject;
import utility.hooks;

public class productPageActions extends hooks {

    public static void verifyProductItem() throws Throwable {
        productNameText = driver.findElements(productPageObject.productName).get(0).getText();
        helpers.compareTexts(nameText, productNameText);
    }

    public static void addProductToBasket() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElements(productPageObject.addToBasket).get(0).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(productPageObject.warning));
    }

    public static void checkBasketAndOpen() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(productPageObject.warning));
        String count = wait.until(ExpectedConditions.visibilityOfElementLocated(homePageObject.myBasketCount)).getText();
        helpers.compareTexts(String.valueOf(1), count);
        driver.findElement(homePageObject.myBasket).click();
        Thread.sleep(2000);
    }
}
