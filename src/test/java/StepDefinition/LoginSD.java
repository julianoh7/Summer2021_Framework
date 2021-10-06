package StepDefinition;
import DriverWrapper.Web;
import Facebook.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;


public class LoginSD extends Web {

    Homepage homepage = new Homepage();
    @Given("I am on Homepage")
    public void launchWebpage(){
        openWebpage();

    }
    @Then("I verify login button is enabled")
    public void isLoginEnabled(){
        Assert.assertTrue(homepage.isLoginButtonEnabled(),"Not enabled");
    }

    @Then("I quit Webpage")
    public void quitPage(){
        quitWebpage();
    }
}
