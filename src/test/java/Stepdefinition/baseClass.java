package Stepdefinition;

import ObjectRepo.HomePage_PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class baseClass {

    public static WebDriver driver;
    public static HomePage_PageObject homePagePageObject;
    public static void driverinit(String URL){

        String browser = "Chrome";

        switch (browser){
            case "Chrome":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "Edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
            case "Safari":
                driver = new SafariDriver();
                driver.manage().window().maximize();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
        }
        driver.get(URL);
        homePagePageObject = new  HomePage_PageObject(driver);
        baseClass.driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.close();
    }

}
