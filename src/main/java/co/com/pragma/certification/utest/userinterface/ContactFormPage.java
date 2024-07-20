package co.com.pragma.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactFormPage {

    public static final Target CONTACT_BUTTON = Target.the("Contact button")
            .located(By.cssSelector("a.nav-link[data-toggle='modal'][data-target='#exampleModal']"));

    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.id("recipient-email"));

    public static final Target NAME_FIELD = Target.the("Name field")
            .located(By.xpath("//*[@id='recipient-name']"));

    public static final Target MESSAGE_FIELD = Target.the("Message field")
            .located(By.id("message-text"));

    public static final Target SEND_BUTTON = Target.the("Send message button")
            .located(By.cssSelector("button.btn.btn-primary"));

    public static final Target ALERT = Target.the("Alert message")
            .located(By.cssSelector(".alert"));
}