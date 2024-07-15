package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSecondStepPage {

    public static final Target SELECT_DEPARTURE_CITY = Target.the("Select Departure city").
            located(By.xpath("//select[@name='fromPort']/option[@value='Boston']\n"));

    public static final Target SELECT_DESTINATION_CITY = Target.the("Select Destination City").
            located(By.xpath("//select[@name='toPort']/option[@value='London']\n"));

    public static final Target BTN_FIND_FLIGHTS = Target.the("Consolas Button").
            located(By.xpath("//input[@type='submit']"));

    public static final Target BTN_SELECT_FLIGHT = Target.the("Consolas Button").
            located(By.xpath("(//input[@type='submit' and @value='Choose This Flight'])[1]"));

    public static final Target INPUT_NAME = Target.the("input name field")
            .located(By.id("inputName"));
    public static final Target INPUT_ADDRESS = Target.the("input address field")
            .located(By.id("address"));
    public static final Target INPUT_CITY = Target.the("input city field")
            .located(By.id("city"));
    public static final Target INPUT_STATE = Target.the("input state field")
            .located(By.id("state"));
    public static final Target INPUT_ZIP_CODE = Target.the("input zip code field")
            .located(By.id("zipCode"));
    public static final Target SELECT_CARD_TYPE = Target.the("select card type")
            .located(By.id("cardType"));
    public static final Target INPUT_CREDIT_CARD_NUMBER = Target.the("input credit card number")
            .located(By.id("creditCardNumber"));
    public static final Target INPUT_CREDIT_CARD_MONTH = Target.the("input credit card month")
            .located(By.id("creditCardMonth"));
    public static final Target INPUT_CREDIT_CARD_YEAR = Target.the("input credit card year")
            .located(By.id("creditCardYear"));
    public static final Target INPUT_NAME_ON_CARD = Target.the("input name on card")
            .located(By.id("nameOnCard"));
    public static final Target CHECKBOX_REMEMBER_ME = Target.the("checkbox remember me")
            .located(By.id("rememberMe"));
    public static final Target BUTTON_PURCHASE_FLIGHT = Target.the("button purchase flight")
            .located(By.cssSelector(".btn.btn-primary"));
    public static final Target BUTTON_HOME = Target.the("home button")
            .located(By.xpath("//a[@class='brand' and @href='home']"));
    public static final Target INPUT_USERNAME = Target.the("username input field")
            .located(By.xpath("//input[@id='email' and @type='email']"));
    public static final Target INPUT_PASSWORD = Target.the("password input field")
            .located(By.xpath("//input[@id='password' and @type='password']"));
    public static final Target BUTTON_LOGIN = Target.the("login button")
            .located(By.xpath("//button[contains(text(), 'Login')]"));
}
