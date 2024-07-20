package co.com.pragma.certification.utest.tasks;
import co.com.pragma.certification.utest.userinterface.ContactFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubmitContactForm implements Task{

    public static SubmitContactForm submit() {
        return instrumented(SubmitContactForm.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContactFormPage.CONTACT_BUTTON)
        );
    }
}
