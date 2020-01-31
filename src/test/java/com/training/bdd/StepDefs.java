package com.training.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
    @Given("I have not yet ordered anything")
    public void i_have_not_yet_ordered_anything() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I go to the {string} category")
    public void i_go_to_the_category(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I select a {string}")
    public void i_select_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("I have a new order")
    public void i_have_a_new_order() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("the order has {int} item in it")
    public void the_order_has_item_in_it(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("my current order total is ${int}")
    public void my_current_order_total_is_$(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I select an {string}")
    public void i_select_an(String string) {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
    }

}
