package ObjectRepo;

import io.cucumber.java.mk_latn.No;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

public class Centres_PageObject {


    WebDriver driver;

    public Centres_PageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sabha Centres")
    WebElement sabhaCentres;
    @FindBy(linkText = "Local Abode")
    WebElement LocalAbode;
    @FindBy(linkText = "London")
    WebElement LondonLink;

    @FindBy(linkText = "North London")
    WebElement NorthLondon;

    @FindBy(linkText = "East London")
    WebElement EastLondon;

    @FindBy(linkText = "Glasgow")
    WebElement Glasgow;

    @FindBy(linkText = "South London")
    WebElement SouthLondon;

    @FindBy(linkText = "Midlands")
    WebElement Midlands;

    @FindBy(xpath = "//a[normalize-space()='International Abode']")
    WebElement InternationAbode;

    @FindBy(linkText = "www.haridhamnj.org")
    WebElement haridhamNJ;

    @FindBy(xpath = "//a[normalize-space()='Ontario, Canada']")
    WebElement ontariocanada;

    @FindBy(linkText = "www.ydscanada.org")
    WebElement ydscanada;

    public void click_ontariocanada() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(ontariocanada));
        ontariocanada.click();
    }

    public void click_haridhamNJ() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(haridhamNJ));
        haridhamNJ.click();
    }

    public void click_ydscanada() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(ydscanada));
        ydscanada.click();
    }

    public void click_InternationalAbode() {
        InternationAbode.click();
    }

    public void click_Midlands() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(Midlands));
        Midlands.click();
    }

    public void click_SouthLondon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(SouthLondon));
        SouthLondon.click();
    }

    public void click_EastLondon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(EastLondon));
        EastLondon.click();
    }

    public void click_Glasgow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(Glasgow));
        Glasgow.click();
    }

    public void click_NorthLondon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(NorthLondon));
        NorthLondon.click();
    }

    public void click_sabhaCentres() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(sabhaCentres));
        sabhaCentres.click();
    }

    public void click_LocalAbode() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(LocalAbode));
        LocalAbode.click();
    }

    public void click_london() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(LondonLink));
        LondonLink.click();
    }
}
