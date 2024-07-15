package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class StepSecond implements Task, Performable {
    public static StepSecond OnThePage() {
        return Tasks.instrumented(StepSecond.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Clicking Departure City");
        actor.attemptsTo(Click.on(UtestSecondStepPage.SELECT_DEPARTURE_CITY));

        System.out.println("Clicking on Destination City");
        actor.attemptsTo(Click.on(UtestSecondStepPage.SELECT_DESTINATION_CITY));

        System.out.println("Clicking on Find Flights");
       actor.attemptsTo(Click.on(UtestSecondStepPage.BTN_FIND_FLIGHTS));
    }
}
