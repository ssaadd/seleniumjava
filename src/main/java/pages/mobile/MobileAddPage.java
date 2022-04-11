package pages.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobileAddPage extends BasePage {
    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");

    public MobileAddPage(WebDriver driver) {
        super(driver);
    }

    public MobileAddPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }
}
