package Facebook;

import DriverWrapper.Web;
import Pages.WebCommands;
import Utils.DateMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage extends WebCommands {
    //Locator for element Homepage
    //WebCommands webCommands = new WebCommands();
    Web web = new Web();
    DateMethods dateMethods = new DateMethods();

    By loginButtonLocator = By.tagName("button");
    By emailBoxLocator = By.id("email");
    By pwdBoxLocator = By.id("pass");
    By timeMachineLocator = By.xpath("//*[@class='buttonContainer']//a"); //DARKSKY
    By findingCalendar = By.xpath("(//button)[6]"); //DARKSKY
    By tempRange = By.xpath("//body/div[@id='week']/a[1]/span[2]");
    By todayTemperature = By.xpath("(//span[@class='minTemp'])[1]");
    By comparingTemperature = By.xpath("(//span[@class='temp'])[1]");
    By timeLocatorDarkSky = By.xpath("(//div[@class='hours'])[1]//span[not(@class='hour') and not(@class='hour first')]");
    By schoolFurnitureLocator = By.xpath("(//a[contains(@class, 'navPages-action-depth')])[8]");
    By classRoomStorageLocator = By.xpath("(//a[text()='Classroom Storage'])[1]");


    //Method to interaction with elements on Homepage(WE use methods from webCommands)
    public void clickLoginButton() {
        // webCommands.clickThis(loginButtonLocator);
        clickThis(loginButtonLocator);
    }

    public void typeLoginEmail(String email) {
        type(email, emailBoxLocator);
    }

    public void typeLoginPwd(String pwd) {
        type(pwd, pwdBoxLocator);
    }

    public boolean isLoginButtonEnabled(){
       return isWebElementEnabled(loginButtonLocator);
    }
    public boolean isCalendarDateCorrect(){
        return isWebElementEqual(timeMachineLocator,findingCalendar);
    }
    public void locatingTimeMachine(){
        //clickThisForActionsClass(timeMachineLocator);
        getWebElement(timeMachineLocator);
    }

    public void clickTimeMachine() {
        clickUsingActionsClass(timeMachineLocator);
    }
    public void clickTodayTimeline() {
        clickUsingActionsClass(tempRange);
    }

    public void getText(){
        getTextMethod(findingCalendar);
    }
    public void getTemp(){
        getTextMethod(todayTemperature);
    }
    public void compareTemp1(){
        getTextMethod(comparingTemperature);
    }
    public boolean areTheTempsMatching(){
        return isWebElementEqual(todayTemperature,comparingTemperature);
    }
//    public void generate12Hour(){
//        generateTimeLine(12);

   // }
    public void getDarkSkyHours(){
            getWebElements(timeLocatorDarkSky);
        }


//    public boolean areTheTempsMatching11(){
//        return isWebElementEqual(timeLocatorDarkSky,"12");
//    }


    public void getDarkSkyHours1(){
        areWebElementsEqual(timeLocatorDarkSky,dateMethods.getCurrentHoursInTwoHourIntervals(12));
    }
    public void moveMouse (){
        movingMouseHoverMethod(schoolFurnitureLocator);
    }
    public String gettingClassroomStorageText(){
       return getTextMethodAsString(classRoomStorageLocator);
    }










}

