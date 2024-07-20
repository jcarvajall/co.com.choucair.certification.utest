package co.com.pragma.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage extends PageObject {
    public static By PRODUCT_LINK(String productName) {
        return By.xpath("//a[text()='" + productName + "']");
    }

    public static By ADD_TO_CART_BUTTON = By.xpath("//a[text()='Add to cart']");

    public static final Target HOME_BUTTON = Target.the("home button")
            .located(By.xpath("//a[@href='index.html' and contains(text(), 'Home')]"));

    public static final Target MONITORS_BUTTON = Target.the("home button")
            .located(By.xpath("//a[text()='Monitors']\n"));

}
