package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constant.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM) {
            case "CHROME_WIN":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
            case "CHROME_MAC":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
            case "MOZILLA_WIN":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
            default:
                Assertions.fail("Incorrect brorser name " + BROWSER_AND_PLATFORM);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
