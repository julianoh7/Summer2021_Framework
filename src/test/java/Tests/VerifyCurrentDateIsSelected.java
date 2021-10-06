package Tests;

import DriverWrapper.Web;
import Facebook.ErrorPage;
import Facebook.Homepage;
import Pages.WebCommands;
import Utils.DateMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCurrentDateIsSelected extends Web {
    WebCommands webCommands= new WebCommands();
    Homepage homepage = new Homepage();
    DateMethods dateMethods = new DateMethods();
    @Test
    public void VerifyingCalenderDate() {
        openDarkSkyWebpage();
        webCommands.scrollDown();
        homepage.locatingTimeMachine();
        homepage.clickTimeMachine();
        dateMethods.getCurrentDate_d();
        homepage.isCalendarDateCorrect();
        quitWebpage();

    }


}
