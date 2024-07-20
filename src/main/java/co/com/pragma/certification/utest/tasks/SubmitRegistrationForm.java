package co.com.pragma.certification.utest.tasks;

import co.com.pragma.certification.utest.userinterface.RegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubmitRegistrationForm implements Task {

    public static SubmitRegistrationForm submit() {
        return instrumented(SubmitRegistrationForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistrationPage.SUBMIT_BUTTON)
        );
    }
}