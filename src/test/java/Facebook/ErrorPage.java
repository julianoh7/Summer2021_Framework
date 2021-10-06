package Facebook;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class ErrorPage extends WebCommands {
    By somethingWrongLocator = By.xpath("//h1[text() = 'Sorry, something went wrong.']");



    public boolean isSomethingWrongErrorDisplayed(){
        return isWebElementDisplayed(somethingWrongLocator);

    }
}
