package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class splBooking {
    @Given("is on home  {string}")
    public void is_on_home(String string) {
        baseClass.driverinit(string);
    }
    @When("User click on Suhradam Premier League \\(SPL) {int} link")
    public void user_click_on_suhradam_premier_league_spl_link(Integer int1) {

        baseClass.homePagePageObject.click_SuhradamBookinglink();

    }
    @When("it should open page Suhradam Premier League \\(SPL) – Cricket Tournament – Yogi Divine Society – UK")
    public void it_should_open_page_suhradam_premier_league_spl_cricket_tournament_yogi_divine_society_uk() {

    }
    @When("Enter details")
    public void enter_details(io.cucumber.datatable.DataTable dataTable) {

    }
    @When("click on upload photo")
    public void click_on_upload_photo() {

    }
    @When("upload photo")
    public void upload_photo() {

    }
    @When("Click on next button")
    public void click_on_next_button() {

    }
    @Then("User should register successfully")
    public void user_should_register_successfully() {

    }
}
