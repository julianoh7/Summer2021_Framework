package Tests;

import DriverWrapper.Web;
import Facebook.Homepage;
import Pages.WebCommands;
import Utils.DateMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hw6 extends Web {
    Homepage homepage = new Homepage();
    WebCommands webCommands = new WebCommands();
    DateMethods dateMethods = new DateMethods();

    @Test
    public void VerifyingTemperaturesFromDarkSky() {
        openDarkSkyWebpage();
        webCommands.scrollDownToTodayTimeLineMethod();
        homepage.clickTodayTimeline();
        homepage.getTemp();
        homepage.compareTemp1();
        homepage.areTheTempsMatching();
        quitWebpage();

    }
    @Test
    public void verifyTimeLineOnHomePage(){
        openDarkSkyWebpage();
        homepage.getDarkSkyHours();
        dateMethods.getCurrentHoursInTwoHourIntervals(12);
        quitWebpage();
    }
    @Test
    public void verifySchoolFurnitureFunction() {
        openClassRoomEssentialsOnlineWebpage();
        homepage.moveMouse();
        String lol = homepage.gettingClassroomStorageText();
        Assert.assertEquals(lol,"CLASSROOM STORAGE");
        quitWebpage();








    }



}
