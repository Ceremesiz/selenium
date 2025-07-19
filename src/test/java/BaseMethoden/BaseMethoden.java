package BaseMethoden;

import Pageinformation.Homepage;
import Pageinformation.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseMethoden {

    protected WebDriver driver;
    protected Homepage homepage;
    public final String LOGIN = "Login";

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        homepage = new Homepage(driver);
    }

   @AfterTest
    public void afterTest(){
        if(driver != null){
            driver.quit();
        }
    }



}
