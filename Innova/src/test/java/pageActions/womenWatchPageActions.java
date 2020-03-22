package pageActions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.womenWatchPageObject;
import utility.hooks;
import helpers.helpers;

public class womenWatchPageActions extends hooks {

    public static void filterProductsByGuess() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(womenWatchPageObject.guess)).click();
        Thread.sleep(2000);
    }

    public static void scrollDownToPaginationOpenSecondPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        helpers.scrollDownToElement(womenWatchPageObject.secondPage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(womenWatchPageObject.secondPage)).click();
        Thread.sleep(2000);
    }

    public static void getDetailsOfFirstProductAndOpen() throws InterruptedException {
        nameText = driver.findElements(womenWatchPageObject.productName).get(0).getText();
        driver.findElements(womenWatchPageObject.productBox).get(0).click();
        Thread.sleep(2000);
    }

}
