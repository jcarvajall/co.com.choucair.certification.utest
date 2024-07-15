package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class StepThird implements Task {

    public static StepThird OnThePage() {
        return Tasks.instrumented(StepThird.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Select Flight 1");
        actor.attemptsTo(Click.on(UtestSecondStepPage.BTN_SELECT_FLIGHT));

    }
}
