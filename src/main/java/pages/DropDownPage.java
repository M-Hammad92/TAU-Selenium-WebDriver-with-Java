package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    // Fields locators
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    // Constructor of driver
    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    //Select all visible text in dropdown
    public void selectFromDropDown(String option){
        Select dropDownElements = new Select(driver.findElement(dropdown));
        dropDownElements.selectByVisibleText(option);
    }

    // Get selected element
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements =
                findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }


    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }

}
