package co.com.choucair.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinPage {
    public static final Target JOIN_BUTTON = Target.the("this button redirects to the form to create a new user")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

}
