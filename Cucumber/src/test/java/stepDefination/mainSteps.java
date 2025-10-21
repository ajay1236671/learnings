package stepDefination;

import io.cucumber.java.en.*;

public class mainSteps {

    @Given("User is on net banking landing page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on net banking landing page");
    }
    @When("User Login into application")
    public void user_login_into_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Login into application");
    }
    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home Page is displayed");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
        System.out.println();
    }

    @When("User Login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Login into application with " + string + " and " + string2);
    }

}
