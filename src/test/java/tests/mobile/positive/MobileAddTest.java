package tests.mobile.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.*;

public class MobileAddTest extends BaseTest {
    @Test
    public void checkRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobileAddPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinRepl(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobileAddPage
                .enterPhone(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCard(MOBILE_PAYMENT_CARD_NUMBER)
                .enterCardExp(MOBILE_PAYMENT_CARD_EXP)
                .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitToCard();
    }
}
