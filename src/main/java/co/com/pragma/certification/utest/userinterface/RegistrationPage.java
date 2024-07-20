package co.com.pragma.certification.utest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPage {

    public static final Target SIGN_UP = Target.the("Username field")
            .located(By.xpath("//a[@id='signin2' and text()='Sign up']"));

    public static final Target USERNAME_FIELD = Target.the("Username field")
            .located(By.id("sign-username"));

    public static final Target PASSWORD_FIELD = Target.the("Password field")
            .located(By.id("sign-password"));

    public static final Target SUBMIT_BUTTON = Target.the("Submit button")
            .located(By.xpath("//button[@type='button' and @class='btn btn-primary' and text()='Sign up']"));
}