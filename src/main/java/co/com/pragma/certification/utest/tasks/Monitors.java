package co.com.pragma.certification.utest.tasks;

import co.com.pragma.certification.utest.userinterface.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Monitors implements Task{

    public static Monitors monitors() {
        return instrumented(Monitors.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductPage.MONITORS_BUTTON)
        );
    }
}
