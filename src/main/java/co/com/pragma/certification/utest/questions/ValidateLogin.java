package co.com.pragma.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ValidateLogin implements Task {

    private final String expectedMessage;

    public ValidateLogin(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }

    public static ValidateLogin withMessage(String expectedMessage) {
        return new ValidateLogin(expectedMessage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((org.openqa.selenium.remote.RemoteWebDriver) actor.abilityTo(BrowseTheWeb.class).getDriver());
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement welcomeMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        String welcomeMessage = welcomeMessageElement.getText();

        assertThat("The welcome message does not contain the text '" + expectedMessage + "'",
                welcomeMessage, containsString(expectedMessage));
    }
}
