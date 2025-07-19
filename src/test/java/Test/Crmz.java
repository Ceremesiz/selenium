package Test;

import General.BaseMethoden;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Crmz extends BaseMethoden {


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


}
