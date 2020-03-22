package helpers;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.hooks;

import java.net.MalformedURLException;


public class helpers extends hooks {


    public static void pageLoadComplete() throws MalformedURLException {
        final JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver driver) {
                return jsDriver.executeScript("return document.readyState", true).toString().equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(driver, 200);
            wait.until(expectation);
        } catch (Throwable error) {
        }
    }

    public static void compareTexts(String arg0, String arg1) throws Throwable {

        try {
            Assert.assertEquals(arg0, arg1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void scrollDownToElement(By ele)  {
        WebElement element = driver.findElement(ele);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
