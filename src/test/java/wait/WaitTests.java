package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests{

    @Test
    public void testWaitUntilHidden(){
        DynamicLoadingExample1Page loadingPage = homePage.clickDynamicLoading().clickExampleOne();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
