package Pageinformation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


public class Homepage extends Locator {
    public Homepage(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(driver, this);
    }


    // ------ Methoden die angewandt werden ------

    //Login
    public void enterLogin(String username, String password) {
        //System.out.println("Entering login");
        usernameField.sendKeys(username);
        passwortField.sendKeys(password);
        submitButton.click();
    }

    //Prüfen der URL nach dem Loginvorgang
    public void UrlPruefung() {
        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

    //Prüfen des Logout Buttons
    public void logout() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(LogoutButton.isDisplayed());
    }

    public void logoutClick() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        LogoutButton.click();
    }

    public String getURL() {
        String actualURL = driver.getCurrentUrl();
        return actualURL;
    }

    public boolean getPageResult(String page) {
        String hompageURL = "https://practicetestautomation.com/logged-in-successfully/";
        String hompageLogoutURL = "https://practicetestautomation.com/practice-test-login/";
        String actualURL = driver.getCurrentUrl();
        boolean result = false;

        if (page.equals("Login")) {
            if (actualURL.equals(hompageURL)) {
                result = true;
            }
            ;
        } else if (page.equals("Logout")) {

            if (actualURL.equals(hompageLogoutURL)) {
                result = true;
            }
            ;
        }

        return result;
    }


    public boolean getPageResult2(String page) {
        String hompageURL = "https://practicetestautomation.com/logged-in-successfully/";
        String hompageLogoutURL = "https://practicetestautomation.com/practice-test-login/";
        String actualURL = driver.getCurrentUrl();
        boolean result = false;

        switch (page) {
            case "Login":
                if (actualURL.equals(hompageURL)) {
                    result = true;
                }
                break;
            case "Logout":
                if (actualURL.equals(hompageLogoutURL)) {
                    result = true;
                }
                break;
            default:
                System.out.println("Page not found");

        }

        return result;
    }


}
