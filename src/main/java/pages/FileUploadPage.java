package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form then clicks Upload button
     * @param absolutePath0File The complete path of file to upload
     */
    public void uploadFile(String absolutePath0File){
        driver.findElement(inputField).sendKeys(absolutePath0File);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFile).getText();
    }
}
