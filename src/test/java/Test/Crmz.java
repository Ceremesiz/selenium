package Test;

import BaseMethoden.BaseMethoden;
import Pageinformation.Homepage;
import Pageinformation.Locator;
import dataProvider.DataProviderDoD;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Crmz extends BaseMethoden {


    @Test(dataProvider = "credentials", dataProviderClass = DataProviderDoD.class)
    public void LoginTestPositive2(String username, String password){
        //Homepage login;
        homepage.enterLogin(username,password);
        // homepage.UrlPruefung();
        Assert.assertTrue(homepage.getPageResult(LOGIN)); // LOGIN weist auf final Variable hin
        homepage.logoutClick();
        Assert.assertTrue(homepage.getPageResult("Logout"));

        //homepage.logout();
    }
}
