package DriverWrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    private static WebDriver driver;

    public void openWebpage(){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
    }
    public void openDarkSkyWebpage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://darksky.net/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void openClassRoomEssentialsOnlineWebpage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://classroomessentialsonline.com/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    public void quitWebpage(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
