package StepDefinition;

import DriverWrapper.Web;
import Facebook.Homepage;
import Pages.WebCommands;
import Utils.DateMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class VerifyMatchingTemps extends Web {

    WebCommands webCommands = new WebCommands();
    Homepage homepage = new Homepage();
    DateMethods dateMethods = new DateMethods();



//    @Given("I am on darkSky Homepage")
//    public void launchDarkSky() {
//
//        openDarkSkyWebpage();
//    }

    @Then("I go down to today's TimeLine")
    public void scrollDownToTimeLine() {

        webCommands.scrollDownToTodayTimeLineMethod();
    }

    @And("I click on today's TimeLine")
    public void clickingTimeLine() {

        homepage.clickTodayTimeline();
    }

    @And("I get today's temp")
    public void gettingTemp() {
        homepage.getTemp();
    }

    @And("I get the temp inside the element")
    public void gettingSecondTemp() {
        homepage.compareTemp1();
    }

    @And("I confirm that the temps are matching")
    public void confirmingTemps() {
        homepage.areTheTempsMatching();
    }

    //Problem2
    @When("I get hours in 2 hour intervals")
    public void getHoursOnDarkSky(){
        homepage.getDarkSkyHours();
    }
    @And("I get current time with 2 hour intervals")
    public void getHoursInTwoHourIntervals(){
        dateMethods.getCurrentHoursInTwoHourIntervals(12);
    }

    //Problem3
    @Given("I am on ClassRoomEssentialsWebsite")
    public void launchingClassRoomEssentials(){
        openClassRoomEssentialsOnlineWebpage();
    }
    @And("I move mouse over to School Furniture")
    public void movingMouseOver(){
        homepage.moveMouse();
    }
    @And("I find Classroom Storage and Verify")
    public void gettingClassRoomText(){
        String lol =homepage.gettingClassroomStorageText();
        Assert.assertEquals(lol,"CLASSROOM STORAGE");
    }




}

