package co.com.pragma.certification.utest.tasks;
import co.com.pragma.certification.utest.userinterface.ProductPage;
import co.com.pragma.certification.utest.userinterface.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillUsername implements Task {

    private final String username;

    public FillUsername(String username) {
        this.username = username;
    }

    public static FillUsername with(String username) {
        return instrumented(FillUsername.class, username);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrationPage.SIGN_UP));
        actor.attemptsTo(
                Enter.theValue(username).into(RegistrationPage.USERNAME_FIELD)
        );
    }
}