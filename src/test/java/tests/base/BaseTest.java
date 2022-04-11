package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.car_loans.CarLoansPage;
import pages.mobile.MobileAddPage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;

@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MobileAddPage mobileAddPage = new MobileAddPage(driver);
    protected CarLoansPage carLoansPage = new CarLoansPage(driver);

@AfterEach
    void clearCookiesAndLocalStorage(){
    if(CLEAR_COOKIES){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        javascriptExecutor.executeScript("window.sessionStorage.clear()");
    }
}

@AfterAll
    void quit(){
    if (!HOLD_BROWSER_OPEN){
        driver.close();
    }
}


}
