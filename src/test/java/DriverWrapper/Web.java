package DriverWrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    private WebDriver driver;

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

    public void quitWebpage(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
