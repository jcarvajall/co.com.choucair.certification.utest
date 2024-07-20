package co.com.pragma.certification.utest.tasks;

import co.com.pragma.certification.utest.userinterface.ContactFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillContactForm implements Task {

    private final String email;
    private final String name;
    private final String message;

    public FillContactForm(String email, String name, String message) {
        this.email = email;
        this.name = name;
        this.message = message;
    }

    public static FillContactForm withDetails(String email, String name, String message) {
        return instrumented(FillContactForm.class, email, name, message);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(ContactFormPage.EMAIL_FIELD),
                Enter.theValue(name).into(ContactFormPage.NAME_FIELD),
                Enter.theValue(message).into(ContactFormPage.MESSAGE_FIELD),
                Click.on(ContactFormPage.SEND_BUTTON)
        );
        System.out.println("Formulario enviado");
    }
}