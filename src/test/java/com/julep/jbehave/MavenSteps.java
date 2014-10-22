package com.julep.jbehave;

import com.julep.steps.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MavenSteps {

    @Steps
    UserSteps endUser;


    @Given("I am on Gift Of Maven Page as guest")
    public void givenIamOnGiftOfMavenPageasguest(){
        endUser.opensPageGiftOfMaven();
    }

    @When("I Choose '$boxes' Gift Subscription")
    public void whenIChooseGiftSubscription(String boxes){
        endUser.chooseGift(boxes);
    }

    @Then("I See '$boxes' Gift Subscription is selected")
    public void thenISeeSelectedSubscriptionIs(String boxes){
        endUser.verifySelectedGiftIs(boxes);
    }

    @When("I add '$boxes' Gift Subscription to cart")
    public void whenIAddGiftSubscriptionToCart(String boxes){
        endUser.addGiftByName(boxes);
    }

    @When("I Order cart")
    public void whenIOrderCart(){

    }

    @Then("I see Order is placed")
    public void thenISeeOrderIsPlaced(){

    }

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }


}
