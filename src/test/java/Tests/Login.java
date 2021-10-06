package Tests;

import DriverWrapper.Web;
import Facebook.ErrorPage;
import Facebook.Homepage;
import Pages.WebCommands;
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
    public void isLoginButtonEnabledOrNot(){
        openWebpage();


        quitWebpage();

    }
    @Test
    public void invalidCredentials() throws InterruptedException {
        openWebpage();
        homepage.typeLoginEmail("abcd@gmail.com");
        homepage.typeLoginPwd("abc@1234");
        homepage.clickLoginButton();
        ErrorPage errorPage = new ErrorPage();
        Assert.assertTrue(errorPage.isSomethingWrongErrorDisplayed(),"Error message not displayed");
        quitWebpage();

    }

}
