package co.com.pragma.certification.utest.stepdefinitions;

import co.com.pragma.certification.utest.questions.ValidateLogin;
import co.com.pragma.certification.utest.questions.ValidateLogout;
import co.com.pragma.certification.utest.questions.VerifyAlert;
import co.com.pragma.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import co.com.pragma.certification.utest.tasks.LogOut;
import co.com.pragma.certification.utest.tasks.LoginUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());


        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(driver));
    }

    @Given("^enter the page$")
    public void JuanSeeksToRegisterOnTheUtestWebSite() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }



    @When("^selects \"([^\"]*)\"$")
    public void selectsProduct(String productName) {
        theActorInTheSpotlight().attemptsTo(selectProduct.byName(productName));
    }

    @And("go to home page")
    public void addsProductToCart() {
        theActorInTheSpotlight().attemptsTo(
                GoToHome.goToHomePage()
        );
    }

    @When("^enter the username \"([^\"]*)\"$")
    public void iEnterTheUsername(String username) throws Throwable {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillUsername.with(username)
        );
    }

    @And("^enter the password \"([^\"]*)\"$")
    public void iEnterThePassword(String password) throws Throwable {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillPassword.with(password)
        );
    }

    @And("submit the registration form")
    public void iSubmitTheRegistrationForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SubmitRegistrationForm.submit()
        );
    }

    @Then("^should see a confirmation message \"([^\"]*)\"$")
    public void iShouldSeeAConfirmationMessage(String expectedMessage) throws Throwable {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerifyAlert.withMessage(expectedMessage)
        );
    }

    @When("^perform login$")
    public void performLogin() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginUser.withCredentials("FAS154398759487323", "45555555")
        );
    }

    @Then("^validate login with message \"([^\"]*)\"$")
    public void validateLoginWithMessage(String expectedMessage) throws Throwable {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ValidateLogin.withMessage(expectedMessage));
    }

    @When("^perform logout$")
    public void performLogout() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogOut.perform()
        );
    }

    @Then("^validate logout$")
    public void validateLogout() {
        OnStage.theActorInTheSpotlight().should(seeThat("the login button is visible",
                ValidateLogout.isVisible()));
    }

    @Given("^go the contact page$")
    public void iAmOnTheContactPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SubmitContactForm.submit()
        );
    }

    @Then("^fill out the contact form with email \"([^\"]*)\", name \"([^\"]*)\", and message \"([^\"]*)\"$")
    public void iFillOutTheContactFormWithEmailNameAndMessage(String email, String name, String message) throws Throwable {
        theActorInTheSpotlight().attemptsTo(FillContactForm.withDetails(email, name, message));
    }

    @Given("^go the monitors$")
    public void goTheMonitors() {
        theActorInTheSpotlight().attemptsTo(
                Monitors.monitors()
        );
    }
}
