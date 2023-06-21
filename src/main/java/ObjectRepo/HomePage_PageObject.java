package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PageObject extends Centres_PageObject {

    WebDriver driver;
    public HomePage_PageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "ABOUT US")
    WebElement aboutusLink;
    @FindBy(linkText = "Donate")
    WebElement donateBUtton;

    @FindBy(xpath = "//a[normalize-space()='']//img")
    WebElement YdsLogo;
    @FindBy(xpath = "//span[normalize-space()='Suhradam Premier League (SPL) 2023']")
    WebElement suhradamBookingLink;

    @FindBy(linkText = "CENTRES")
    WebElement centresLink;

    public void click_Aboutuslink(){
        aboutusLink.click();
    }
    public void click_DonateButton(){
        donateBUtton.click();
    }

    public void click_ydsLogo(){
        YdsLogo.click();
    }

    public void click_SuhradamBookinglink(){
        suhradamBookingLink.click();
    }
    public void click_CentresLink(){
        centresLink.click();
    }

}
