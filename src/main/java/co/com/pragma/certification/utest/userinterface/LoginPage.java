package co.com.pragma.certification.utest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class LoginPage {

    public static final Target BUTTON_OPEN_LOGIN_MODAL = Target.the("button to open login modal")
            .located(By.xpath("//a[@id='login2']"));

    public static final Target INPUT_USERNAME = Target.the("username input field")
            .located(By.xpath("//input[@id='loginusername']"));

    public static final Target INPUT_PASSWORD = Target.the("password input field")
            .located(By.xpath("//input[@id='loginpassword']"));

    public static final Target BUTTON_LOGIN = Target.the("login button")
            .located(By.xpath("//button[@onclick='logIn()']"));

    public static final Target WELCOME_MESSAGE = Target.the("welcome message")
            .located(By.xpath("//a[@id='nameofuser']"));

    public static final Target BUTTON_LOGOUT = Target.the("button to logout")
            .locatedBy("//a[@id='logout2']");


}
