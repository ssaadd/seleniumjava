package tests.car_loans.positive;

import org.junit.jupiter.api.Test;
import pages.car_loans.CarLoansPage;
import tests.base.BaseTest;

import static constants.Constant.LOANS_URL;

public class carLoanTest  extends BaseTest {
    @Test
    public void selectAgreements(){
        basePage.goToUrl(LOANS_URL);
        carLoansPage.selectAgreementsTab();
        basePage.isAuthWidgetPresent();
    }
}
