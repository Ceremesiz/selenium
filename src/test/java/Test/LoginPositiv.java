package Test;

import BaseMethoden.BaseMethoden;
import Pageinformation.Homepage;
import Pageinformation.Locator;
import dataProvider.DataProviderDoD;
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
//DataProvider
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
//Test_Array
    @Test()
    public void LoginArrayTest(){
        String[][] liste = {{"student","Password123"},{"student","Password123"},{"student","Password123"}};
        for(int i=0;i<liste.length;i++) {

            String username = liste[i][0];
            String password = liste[i][1];


            //Homepage login;
            homepage.enterLogin(username,password);
            // homepage.UrlPruefung();
            Assert.assertTrue(homepage.getPageResult(LOGIN)); // LOGIN weist auf final Variable hin
            homepage.logoutClick();
            Assert.assertTrue(homepage.getPageResult("Logout"));
        }
    }
    // enabled = false : Skippt den testfall
    @Test(groups = "smoketest")
    public void LoginTestPositive3(){

    }




}

