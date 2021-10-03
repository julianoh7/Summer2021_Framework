package Pages;


import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebCommands {
    Web web = new Web();

    public WebElement getWebElement(By locator) {
        return web.getDriver().findElement(locator);
    }

    public void clickThis (By locator){
        getWebElement(locator).click();
    }

    public void type(String data, By locator){
        getWebElement(locator).sendKeys(data);
    }
    public boolean isWebElementEnabled(By locator){
         return getWebElement(locator).isEnabled();
    }

}
