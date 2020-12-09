package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;
import static  org.testng.Assert.*;


import java.util.List;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        String option = "Option 1";

        //Initiate Object from DropDown PO
        DropDownPage dropDownPage = homePage.clickDropDown();
        // Passing Test data
        dropDownPage.selectFromDropDown("Option 1");
        // Get selected option in List
        List<String> selectedOptions  = dropDownPage.getSelectedOptions();
        //Assert on numbers of Selected is 1
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        //Assert that retrieved is the selected option
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
