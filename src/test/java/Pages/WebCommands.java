package Pages;


import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class WebCommands {
    Web web = new Web();

    public WebElement getWebElement(By locator) {
        return web.getDriver().findElement(locator);
    }

    public void clickThis (By locator){
        getWebElement(locator).click();
    }
    public void getTextMethod (By locator){
        getWebElement(locator).getText();
    }


    public void clickThisUsingActionsClass (By locator){

        WebElement element = getWebElement(locator);
        Actions actions = new Actions(web.getDriver());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.click(element).build().perform();
    }

    public void type(String data, By locator){
        getWebElement(locator).sendKeys(data);
    }
    public boolean isWebElementEnabled(By locator){
         return getWebElement(locator).isEnabled();
    }
    public boolean isWebElementEqual(By locator, By locator11){
        return getWebElement(locator).equals(getWebElement(locator11));
    }
//    public boolean isWebElementEnabled11111(By locator, By locator1) {
//         return Assert.assertEquals(locator,locator1);
//    }

    public boolean isWebElementDisplayed(By locator) {
        return getWebElement(locator).isDisplayed();
    }
    public void scrollDown(){
        JavascriptExecutor b = (JavascriptExecutor) web.getDriver();
        b.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
//    public void clickThisForActionsClass (By locator) {
//        getWebElement(locator);
//    }
//    public void lol(WebElement locator){
//        Actions actions = new Actions(web.getDriver());
//        actions.click().perform();
//    }


}
