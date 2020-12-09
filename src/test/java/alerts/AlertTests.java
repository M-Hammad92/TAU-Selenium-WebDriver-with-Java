package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    String promptText = "Hello";

    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        alertsPage.getResult();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Result test incorrect");
    }
    @Test
    public void testGetTextFromAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testTextFromPrompt(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPromptButton();
        String text = "Hello p";
        alertsPage.alert_insertText(text);
        alertsPage.alert_clickToAccept();
        alertsPage.getResult();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Incorrect message");

    }
}
