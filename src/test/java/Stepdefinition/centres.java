package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Base64;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class centres {

    @When("User click on Centres and Redirect to centres page")
    public void user_click_on_centres_and_redirect_to_centres_page() {
        baseClass.homePagePageObject.click_CentresLink();

    }

    @When("click on London and it will shows the address and contact email")
    public void click_on_london_and_it_will_shows_the_address_and_contact_email() {

        baseClass.homePagePageObject.click_london();
    }

    @When("click on Local Abode it will shows the local address and details")
    public void click_on_local_abode_it_will_shows_the_local_address_and_details() {
        baseClass.homePagePageObject.click_LocalAbode();
    }

    @When("click on Sabha Centres link it will shows all sabha centres")
    public void click_on_sabha_centres_link_it_will_shows_all_sabha_centres() {
        baseClass.homePagePageObject.click_sabhaCentres();
        baseClass.homePagePageObject.click_NorthLondon();

    }

    @When("click on Glasgow link it will shows the glasgow centres details")
    public void click_on_glasgow_link_it_will_shows_the_glasgow_centres_details() {

        baseClass.homePagePageObject.click_Glasgow();
        baseClass.homePagePageObject.click_Glasgow();
    }

    @When("click on EastLondon link it will shows the East London centres details")
    public void click_on_east_london_link_it_will_shows_the_east_london_centres_details() {

        baseClass.homePagePageObject.click_EastLondon();
        baseClass.homePagePageObject.click_EastLondon();
    }

    @When("click on South London link it will shows all south london centres details")
    public void click_on_south_london_link_it_will_shows_all_south_london_centres_details() {

        baseClass.homePagePageObject.click_SouthLondon();
        baseClass.homePagePageObject.click_SouthLondon();
    }

    @When("click on Midlands link it will shows midlands centres details and click on given contac email it will open the")
    public void click_on_midlands_link_it_will_shows_midlands_centres_details_and_click_on_given_contac_email_it_will_open_the() {

        baseClass.homePagePageObject.click_Midlands();
        baseClass.homePagePageObject.click_Midlands();
    }

    @When("click on International Abode and it will shows all international centres")
    public void click_on_international_abode_and_it_will_shows_all_international_centres() {
        baseClass.homePagePageObject.click_InternationalAbode();


    }

    @And("click on new jersey,USA link it will redirect to haridhamnj.org link")
    public void clickOnNewJerseyUSALinkItWillRedirectToHaridhamnjOrgLink()  {

        baseClass.homePagePageObject.click_haridhamNJ();
        Set<String> window = baseClass.driver.getWindowHandles();
        Iterator<String> iter = window.iterator();
        String parentwindow = iter.next();
        String childwindow = iter.next();
        baseClass.driver.switchTo().window(parentwindow);

        baseClass.homePagePageObject.click_CentresLink();
        baseClass.homePagePageObject.click_InternationalAbode();

        Actions builder = new Actions(baseClass.driver);
      for (int i = 1; i<=4; i++){
          builder.sendKeys(Keys.PAGE_DOWN).build().perform();

      }
        baseClass.homePagePageObject.click_ontariocanada();

    }

    @When("click on Ontario,Canada link it will shows all details and click on ydscanada.org link it will open in new tab")
    public void click_on_ontario_canada_link_it_will_shows_all_details_and_click_on_ydscanada_org_link_it_will_open_in_new_tab() {
        baseClass.homePagePageObject.click_ydscanada();

        Set<String> window = baseClass.driver.getWindowHandles();
        Iterator<String> iter = window.iterator();
        String parentWindow = iter.next();
        String child = iter.next();
        baseClass.driver.switchTo().window(parentWindow);
    }

    @Then("After all task user should successfully comeback to home page")
    public void afterAllTaskUserShouldSuccessfullyComebackToHomePage() {
        baseClass.homePagePageObject.click_ydsLogo();
    }


}
