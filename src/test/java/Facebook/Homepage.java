package Facebook;

import DriverWrapper.Web;
import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage extends WebCommands {
    //Locator for element Homepage
    //WebCommands webCommands = new WebCommands();
    Web web = new Web();

    By loginButtonLocator = By.tagName("button");
    By emailBoxLocator = By.id("email");
    By pwdBoxLocator = By.id("pass");
    By timeMachineLocator = By.xpath("//*[@class='buttonContainer']//a"); //DARKSKY
    By findingCalendar = By.xpath("(//button)[6]"); //DARKSKY





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
        clickThisUsingActionsClass(timeMachineLocator);
    }

    public void getText(){
        getTextMethod(findingCalendar);
    }





}

