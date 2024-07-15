package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^enter the page$")
    public void JuanSeeksToRegisterOnTheUtestWebSite() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());

       }

    @When("^go to find flights$")
    public void HeCompletesEachStepOfTheUserRegistration() {
        OnStage.theActorCalled("Juan").wasAbleTo((StepSecond.OnThePage()));

    }
    @And("^go to select flight$")
    public void HeCompletesEachStepOfTheUserRegistrations() {
        OnStage.theActorCalled("Juan").wasAbleTo((StepThird.OnThePage()));

    }

    @Then("^validate data for flight purchase$")
    public void VerifyThatThRegistrationHasBeenCorrectly() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                StepFourth.withData(
                        "John Doe",
                        "123 Main St.",
                        "Anytown",
                        "State",
                        "12345",
                        "visa",
                        "4111111111111111",
                        "11",
                        "2017",
                        "John Smith"
                )
        );
    }
    @When("^perform login$")
    public void performLogin() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                StepFifth.withCredentials("username123", "password123")
        );
    }

    @Then("^validate login$")
    public void validateLogin() {
        // Add your validation logic here
    }
}
