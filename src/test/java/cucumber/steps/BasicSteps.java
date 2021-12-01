/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumber.steps;

import cucumber.model.Belly;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 *
 * @author nadies
 */
public class BasicSteps {

    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(Integer cukes) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @Given("I have {int} cukes on mi seat")
    public void i_have_cukes_on_mi_seat(Integer int1) {
        
        
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
