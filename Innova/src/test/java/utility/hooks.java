package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

public class hooks {

    public static WebDriver driver;

    public static String projectPath = System.getProperty("user.dir");
    public static String chromePath = projectPath + "\\drivers\\chromedriver.exe";

    public static String nameText;
    public static String productNameText ;
    public static String basketNameText;

    public static Properties selectors = new Properties();

    static {
        try {
            FileInputStream selectorfile = new FileInputStream(System.getProperty("user.dir") + "\\src\\selector.properties");
            selectors.load(selectorfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public hooks() {
        hooks.driver = getDriver();
    }

    public static void set_up_browser(BrowserType browser) throws MalformedURLException {

        selectBrowser(browser);
    }


    public static void tear_Down() {
        driver.quit();
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public static void selectBrowser(BrowserType browserType) throws MalformedURLException {
        switch (browserType) {
            case Chrome:
                ChromeOptions optionsChrome = new ChromeOptions();
                optionsChrome.addArguments("--start-maximized");
                optionsChrome.addArguments("disable-infobars");
                optionsChrome.addArguments("--disable-notifications");
                optionsChrome.addArguments("--disable-popup-blocking");
                optionsChrome.addArguments("--disable-extensions");
                optionsChrome.addArguments("--lang=en-au");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(optionsChrome);
                driver.manage().window().maximize();
                break;
            case Firefox:
                break;
            case IE:
                break;
            default:
                break;
        }
    }

    public enum BrowserType {
        Chrome,
        Firefox,
        IE,
    }
}
