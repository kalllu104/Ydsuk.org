package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class aboutUs {
    @Given("User is on home {string}")
    public void user_is_on_home(String string) {
       baseClass.driverinit(string);
    }
    @When("User click on About Us link")
    public void user_click_on_about_us_link() {
        baseClass.homePagePageObject.click_Aboutuslink();
        Actions builder = new Actions(baseClass.driver);
        builder.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
    @Then("User redirect to About us page.")
    public void user_redirect_to_about_us_page() {
        System.out.println("User is on aboutus page");
    }
}
