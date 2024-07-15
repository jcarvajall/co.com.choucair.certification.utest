package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.userinterface.UtestSecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StepFifth implements Task {
    private final String username;
    private final String password;

    public StepFifth(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static StepFifth withCredentials(String username, String password) {
        return instrumented(StepFifth.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestSecondStepPage.BUTTON_HOME),
                Enter.theValue(username).into(UtestSecondStepPage.INPUT_USERNAME),
                Enter.theValue(password).into(UtestSecondStepPage.INPUT_PASSWORD),
                Click.on(UtestSecondStepPage.BUTTON_LOGIN)
        );
    }
}
