package tests.mobile.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.MOBILE_PAYMENT_URL;

public class MobileAddTest extends BaseTest {
    @Test
    public void checkRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobileAddPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }
}
