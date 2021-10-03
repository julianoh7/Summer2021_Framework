package Tests;

import DriverWrapper.Web;
import Facebook.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Web{
    //*Verify login button is enabled after launching the web-page
    /*
    1.Launch Webpage
    2. Verify login button is enabled
    3.quit webpage
     */

    Homepage homepage = new Homepage();

    @Test
    public void isLoginButtonEnabled(){
        openWebpage();
        Assert.assertTrue(homepage.isLogginButtonEnabled(),"Loggin button is not enabled");
        quitWebpage();





    }


}
