package General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    protected  WebDriver driver;
    protected WebDriverWait wait;



    //Konstruktur erstellen
    public Browser(WebDriver driver){
        this.driver = driver;// Uebergebener Driver wird dem internen Feld zugewiesen. Wenn jemnad die Klasse LoginPage
        // öffnen möchte, muss er den Webdriver übergeben
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }





}
