package Test;

import BaseMethoden.BaseMethoden;
import Pageinformation.Homepage;
import Pageinformation.Locator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPositiv extends BaseMethoden {

    @Test(groups = "smoketest")
    public void LoginTestPositive(){
        //Homepage login;
        homepage.enterLogin("student","Password123");
       // homepage.UrlPruefung();
        Assert.assertEquals(homepage.getURL(),"https://practicetestautomation.com/practice-test-login/");
        homepage.logout();
    }

    @Test(groups = "smoketest")
    public void LoginTestPositive2(){
        //Homepage login;
        homepage.enterLogin("student","Password123");
        // homepage.UrlPruefung();
        Assert.assertTrue(homepage.getPageResult(LOGIN));
        homepage.logoutClick();
        Assert.assertTrue(homepage.getPageResult("Logout"));

        //homepage.logout();
    }
    // enabled = false : Skippt den testfall
    @Test(groups = "smoketest")
    public void LoginTestPositive3(){

    }




}

