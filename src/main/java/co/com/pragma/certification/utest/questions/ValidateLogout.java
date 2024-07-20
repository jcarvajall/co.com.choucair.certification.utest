package co.com.pragma.certification.utest.questions;

import co.com.pragma.certification.utest.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateLogout implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPage.BUTTON_OPEN_LOGIN_MODAL.resolveFor(actor).isVisible();
    }

    public static ValidateLogout isVisible() {
        return new ValidateLogout();
    }
}
