package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace(){
        KeyPressPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE$");
    }

    @Test
    public void testPi(){
        KeyPressPage keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }
}
