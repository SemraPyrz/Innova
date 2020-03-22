package pageActions;

import helpers.helpers;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.homePageObject;
import utility.hooks;

import java.net.MalformedURLException;


public class homePageActions extends hooks {

    public static void launchUrl(String arg0) throws MalformedURLException {
        String selector = selectors.getProperty(arg0);
        driver.get(selector);
        helpers.pageLoadComplete();
    }

    public static void refreshPage() throws Throwable {
        driver.navigate().refresh();
        Thread.sleep(2000);
    }

    public static void openFashionMenuChooseWomenWatch() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePageObject.fashionMenu)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePageObject.womenWatch)).click();

    }

}
