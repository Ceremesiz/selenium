package Test;

import BaseMethoden.BaseMethoden;
import org.testng.annotations.Test;

@Test
public class NegativerLoginTest extends BaseMethoden {
    public void errorMessag_falscherUsername(){
        //Login
        homepage.enterLogin("STudent","Password123");

        //Prüfe die Error-Message

    }


}
