package co.com.pragma.certification.utest.tasks;

import co.com.pragma.certification.utest.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogOut implements Task {

    public static LogOut perform() {
        return instrumented(LogOut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.BUTTON_LOGOUT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LoginPage.BUTTON_LOGOUT)
        );
        System.out.println("Cierra Sesion");
    }
}
