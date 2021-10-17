package Pages;


import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WebCommands {
    Web web = new Web();

    public WebElement getWebElement(By locator) {
        return web.getDriver().findElement(locator);
    }

    public List<WebElement> getWebElementsMethod(By locator) {
        return web.getDriver().findElements(locator);
    }


    public void clickThis(By locator) {
        getWebElement(locator).click();
    }

    public void getTextMethod(By locator) {
        getWebElement(locator).getText();
    }
//    public void getTodayTemp (By locator){
//        getWebElement(locator).getText();
//    }


    public void clickUsingActionsClass(By locator) {

        WebElement element = getWebElement(locator);
        Actions actions = new Actions(web.getDriver());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.click(element).build().perform();
    }

    public void type(String data, By locator) {
        getWebElement(locator).sendKeys(data);
    }

    public boolean isWebElementEnabled(By locator) {
        return getWebElement(locator).isEnabled();
    }

    public boolean isWebElementEqual(By locator, By locator11) {
        return getWebElement(locator).equals(getWebElement(locator11));
    }
//    public boolean isWebElementEnabled11111(By locator, By locator1) {
//         return Assert.assertEquals(locator,locator1);
//    }

    public boolean isWebElementDisplayed(By locator) {
        return getWebElement(locator).isDisplayed();
    }

    public void scrollDown() {
        JavascriptExecutor b = (JavascriptExecutor) web.getDriver();
        b.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void scrollDownToTodayTimeLineMethod() {
        JavascriptExecutor js = (JavascriptExecutor) web.getDriver();
        js.executeScript("scrollBy(0,500)");
    }

    public void getWebElements(By locator) {
        getWebElementsMethod(locator).toString();

    }

    public boolean areWebElementsEqual(By locator, String locator11) {
        return getWebElementsMethod(locator).equals(locator11);
    }

    public void movingMouseHoverMethod(By locator) {
        Actions act = new Actions(web.getDriver());
        WebElement click1 = web.getDriver().findElement(locator);
        act.moveToElement(click1).build().perform();
    }
    public String getTextMethodAsString(By locator) {
        return getWebElement(locator).getText();
    }


}
