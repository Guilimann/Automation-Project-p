package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("the website is opened")
        public void the_website_is_opened() {
            System.out.println("Application is opened");
        }
    @When("the user click on login page")
    public void the_user_click_on_login_page() {
        System.out.println("Step 1: User click on login page");
    }
    @And("the user enter username")
    public void the_user_enter_username() {
        System.out.println("Step 2: The user enter username");
    }

    @And("the user enter password")
    public void the_user_enter_password () {
        System.out.println("Step 3: The user enter password");
    }

    @Then("Click the login button")
        public void Click_the_login_button () {
            System.out.println("Step 4: Click the login button");
        }

}



