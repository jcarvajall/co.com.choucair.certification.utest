package co.com.pragma.certification.utest.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerifyAlert implements Task {

    private final String expectedMessage;

    public VerifyAlert(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }

    public static VerifyAlert withMessage(String expectedMessage) {
        return instrumented(VerifyAlert.class, expectedMessage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((org.openqa.selenium.remote.RemoteWebDriver) actor.abilityTo(BrowseTheWeb.class).getDriver());
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept();

            System.out.println("Alert text: [" + alertText + "]");
            if (!alertText.equals(expectedMessage)) {
                throw new AssertionError("Expected alert message: " + expectedMessage + " but got: " + alertText);
            }

        } catch (NoAlertPresentException e) {
            throw new AssertionError("No alert was present: " + e.getMessage(), e);
        } catch (TimeoutException e) {
            throw new AssertionError("Timed out waiting for alert: " + e.getMessage(), e);
        } catch (Exception e) {
            throw new AssertionError("Error occurred while verifying alert: " + e.getMessage(), e);
        }
    }
}