package StepDefinition;

import Darksky.HomePageForDarkSky;
import DriverWrapper.Web;
import Facebook.Homepage;
import Pages.WebCommands;
import Utils.DateMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VerifyCurrentDate extends Web {
    WebCommands webCommands= new WebCommands();
    Homepage homepage = new Homepage();
    DateMethods dateMethods = new DateMethods();



    @Given("I am on darkSky Homepage")
    public void launchDarkSky() {
        openDarkSkyWebpage();
    }
    @Then("I scroll down")
    public void scrollDownPage() {
        webCommands.scrollDown();
    }

    @And("I click on time-machine")
    public void clickingElement(){
        homepage.clickTimeMachine();
    }
    @And("I find the calender and collect current date")
    public void findingCalendarElement(){
        homepage.clickTimeMachine();
    }
    @And("I get today's date")
    public void gettingCurrentDate(){
        dateMethods.getCurrentDate_d();
    }
    @And("I confirm that calendar date is up to date and correct")
    public void isTheCalendarUpToDate(){
        homepage.isCalendarDateCorrect();
    }



}
