package pages.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobileAddPage extends BasePage {
    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number')]");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount')]");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource')]");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource')]");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource')]");
    private final By buttonSubmitToCard = By.xpath("//input[@data-qa-node='submit')]");

    public MobileAddPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Choose card from the wallet
     *
     */
    public MobileAddPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     * Enter
     *
     * @param number phone number
     */
    public MobileAddPage enterPhone(String number) {
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    /**
     * Enter
     *
     * @param amount money amount
     */
    public MobileAddPage enterAmount(String amount) {
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    /**
     * Enter
     *
     * @param card card number
     */
    public MobileAddPage enterCard(String card) {
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    /**
     * Enter
     *
     * @param cvv card cvv
     */
    public MobileAddPage enterCardCvv(String cvv) {
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }

    /**
     * Enter
     *
     * @param expDate card exp date
     */
    public MobileAddPage enterCardExp(String expDate) {
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    /**
     * Click submit to card button
     *
     */
    public MobileAddPage submitToCard() {
        driver.findElement(buttonSubmitToCard).click();
        return this;
    }


}
