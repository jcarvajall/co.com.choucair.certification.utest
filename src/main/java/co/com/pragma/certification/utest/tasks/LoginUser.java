package co.com.pragma.certification.utest.tasks;

import co.com.pragma.certification.utest.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {

    private final String username;
    private final String password;

    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginUser withCredentials(String username, String password) {
        return instrumented(LoginUser.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.BUTTON_OPEN_LOGIN_MODAL), // Open login modal
                Enter.theValue(username).into(LoginPage.INPUT_USERNAME), // Enter username
                Enter.theValue(password).into(LoginPage.INPUT_PASSWORD), // Enter password
                Click.on(LoginPage.BUTTON_LOGIN) // Click login button
        );
    }
}
