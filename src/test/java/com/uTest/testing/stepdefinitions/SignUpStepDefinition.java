package com.uTest.testing.stepdefinitions;

import com.uTest.testing.questions.VerifyFormTwoQuestion;
import com.uTest.testing.tasks.OpenBrowserTask;
import com.uTest.testing.tasks.SignUpTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static com.uTest.testing.utils.UserEnum.*;

;


public class SignUpStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor userAutomation = Actor.named("userAutomation");

    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
        userAutomation.can(BrowseTheWeb.with(webDriver));
    }

    @Given("^I am on uTest page$")
    public void iAmOnUTestPage() {
        userAutomation.attemptsTo(OpenBrowserTask.openBrowserTask());
    }

    @When("^I complete the form$")
    public void iCompleteTheForm() {
    userAutomation.attemptsTo(SignUpTask.signUpTask());
    }

    @Then("^I validate that I am form two$")
    public void iValidateThatIAmFormTwo() {
        userAutomation.should(GivenWhenThen.seeThat(VerifyFormTwoQuestion.verifyFormTwoQuestion(), Matchers.equalTo(TITLE_FORM_2.getValue())));

    }
}
