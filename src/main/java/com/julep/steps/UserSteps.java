package com.julep.steps;

import com.julep.pages.GiftOfMavenPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static org.fest.assertions.Assertions.assertThat;

public class UserSteps extends ScenarioSteps {

    GiftOfMavenPage giftOfMavenPage;

    public UserSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void opensPageGiftOfMaven() {
        giftOfMavenPage.open();
    }

    @Step
    public void enters(String keyword) {
        giftOfMavenPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        giftOfMavenPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(giftOfMavenPage.getDefinitions()).contains(definition);
    }

    @Step
    public void is_the_home_page() {
        giftOfMavenPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    @Step
    public void chooseGift(String boxes) {
        giftOfMavenPage.selectGiftByName(boxes);
    }

    @Step
    public void verifySelectedGiftIs(String boxes) {
        assertThat(giftOfMavenPage.getGiftButtonByName(boxes).getText().contains("SELECTED"));
    }

    @Step
    public void addGiftByName(String boxes) {
        giftOfMavenPage.addGiftToBagByName(boxes);
    }
}
