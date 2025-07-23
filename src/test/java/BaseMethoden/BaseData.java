package BaseMethoden;


import Pageinformation.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseData {

    protected WebDriver driver;
    protected Homepage homepage;
    public final String LOGIN = "Login";

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.out.println("Setup gestartet");
        driver = new ChromeDriver();  // RICHTIG: driver zuerst
        driver.get("https://practicetestautomation.com/practice-test-login/");
        homepage = new Homepage(driver);  // dann homepage initialisieren
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
