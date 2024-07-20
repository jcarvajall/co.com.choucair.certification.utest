package co.com.pragma.certification.utest.tasks;

import co.com.pragma.certification.utest.userinterface.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillPassword implements Task {

    private final String password;

    public FillPassword(String password) {
        this.password = password;
    }

    public static FillPassword with(String password) {
        return instrumented(FillPassword.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(RegistrationPage.PASSWORD_FIELD)
        );
    }
}