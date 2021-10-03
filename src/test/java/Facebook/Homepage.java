package Facebook;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class Homepage extends WebCommands {
    //Locator for element Homepage
    //WebCommands webCommands = new WebCommands();

    By loginButtonLocator = By.tagName("button");
    By emailBoxLocator = By.id("email");
    By pwdBoxLocator = By.id("pass");


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

    public boolean isLogginButtonEnabled(){
       return isWebElementEnabled(loginButtonLocator);
    }





}

