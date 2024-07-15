package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StepFourth implements Task {
    private final String name;
    private final String address;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String cardType;
    private final String creditCardNumber;
    private final String creditCardMonth;
    private final String creditCardYear;
    private final String nameOnCard;


    public StepFourth(String name, String address, String city, String state, String zipCode, String cardType, String creditCardNumber, String creditCardMonth, String creditCardYear, String nameOnCard) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.cardType = cardType;
        this.creditCardNumber = creditCardNumber;
        this.creditCardMonth = creditCardMonth;
        this.creditCardYear = creditCardYear;
        this.nameOnCard = nameOnCard;
    }

    public static StepFourth withData(String name, String address, String city, String state, String zipCode, String cardType, String creditCardNumber, String creditCardMonth, String creditCardYear, String nameOnCard) {
        return instrumented(StepFourth.class, name, address, city, state, zipCode, cardType, creditCardNumber, creditCardMonth, creditCardYear, nameOnCard);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(UtestSecondStepPage.INPUT_NAME),
                Enter.theValue(address).into(UtestSecondStepPage.INPUT_ADDRESS),
                Enter.theValue(city).into(UtestSecondStepPage.INPUT_CITY),
                Enter.theValue(state).into(UtestSecondStepPage.INPUT_STATE),
                Enter.theValue(zipCode).into(UtestSecondStepPage.INPUT_ZIP_CODE),
                SelectFromOptions.byValue(cardType).from(UtestSecondStepPage.SELECT_CARD_TYPE),
                Enter.theValue(creditCardNumber).into(UtestSecondStepPage.INPUT_CREDIT_CARD_NUMBER),
                Enter.theValue(creditCardMonth).into(UtestSecondStepPage.INPUT_CREDIT_CARD_MONTH),
                Enter.theValue(creditCardYear).into(UtestSecondStepPage.INPUT_CREDIT_CARD_YEAR),
                Enter.theValue(nameOnCard).into(UtestSecondStepPage.INPUT_NAME_ON_CARD),
                Click.on(UtestSecondStepPage.CHECKBOX_REMEMBER_ME),
                Click.on(UtestSecondStepPage.BUTTON_PURCHASE_FLIGHT)
        );
    }
}
