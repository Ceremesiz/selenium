package Pageinformation;

import General.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Lokalisierung der Wegelemente
public class Locator extends Browser {
    public Locator(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwortField;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(linkText = "Log out")
    public WebElement LogoutButton;


    }
