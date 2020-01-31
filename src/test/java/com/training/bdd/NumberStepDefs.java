package com.training.bdd;

import com.training.tdd.NumberCharacteristics;
import com.training.tdd.NumberException;
import com.training.tdd.NumberService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class NumberStepDefs {
    private NumberService numberService = new NumberService();
    private NumberCharacteristics numberCharacteristics;
    private Integer number;

    @Given("a number {int}")
    public void a_number(Integer number) {
        this.number = number;
    }

    @When("I try to get characteristics for a number")
    public void i_try_to_get_characteristics_for_a_number() throws NumberException {
       numberCharacteristics = numberService.getCharacteristics(number);
    }

    @Then("I get number characteristics saying prime as {} and perfect square as {}")
    public void i_get_number_characteristics_saying_prime_and_perfect_square(String isPrime, String isPerfectSquare) {
        Assertions.assertEquals(
                numberCharacteristics.getIsPrime(),
                Boolean.parseBoolean(isPrime));

        Assertions.assertEquals(
                numberCharacteristics.getIsPerfectSquare(),
                Boolean.parseBoolean(isPerfectSquare));
    }

}
