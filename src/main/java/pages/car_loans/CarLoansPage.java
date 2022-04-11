package pages.car_loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {
    public WebDriver driver;
    public final By tabAgreements = By.xpath("//div[contains(text(), 'Agreements')]");
    public CarLoansPage(WebDriver driver) {
        this.driver = driver;
    }

    public CarLoansPage selectAgreementsTab(){
        driver.findElement(tabAgreements).click();
        return this;
    }
}
