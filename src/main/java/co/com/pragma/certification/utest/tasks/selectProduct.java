package co.com.pragma.certification.utest.tasks;

import co.com.pragma.certification.utest.userinterface.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class selectProduct implements Task {

    private final String productName;

    public selectProduct(String productName) {
        this.productName = productName;
    }

    public static selectProduct byName(String productName) {
        return instrumented(selectProduct.class, productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((org.openqa.selenium.remote.RemoteWebDriver) actor.abilityTo(BrowseTheWeb.class).getDriver());
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {

            actor.attemptsTo(
                    Click.on(ProductPage.PRODUCT_LINK(productName))
            );
            System.out.println("Clicked on the product link: " + productName);


            wait.until(ExpectedConditions.elementToBeClickable(ProductPage.ADD_TO_CART_BUTTON));
            System.out.println("");

            actor.attemptsTo(
                    Click.on(ProductPage.ADD_TO_CART_BUTTON)
            );
            System.out.println("Clicked on the 'Add to cart' button");


            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
            System.out.println("Alert accepted");

        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}