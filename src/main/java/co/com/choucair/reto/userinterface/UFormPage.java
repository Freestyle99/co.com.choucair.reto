package co.com.choucair.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UFormPage {
    public static final Target INPUT_FINAME = Target.the("Field to enter first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LANAME = Target.the("Field to enter last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Field to enter email address")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select month birthday")
            .located(By.cssSelector("select#birthMonth"));
    public static final Target SELECT_DAY = Target.the("Select day birthday")
            .located(By.cssSelector("select#birthDay"));
    public static final Target SELECT_YEAR = Target.the("Select year birthday")
            .located(By.cssSelector("select#birthYear"));
    public static final Target LOCATION_BUTTON = Target.the("Location details in real time")
            .located(By.cssSelector(".btn.btn-blue"));
    public static final Target DEVICES_BUTTON = Target.the("Device details")
            .located(By.cssSelector(".btn.btn-blue"));
    public static final Target LAST_BUTTON = Target.the("Creation of password")
            .located(By.cssSelector(".btn.btn-blue"));
    public static final Target INPUT_CREPASSWORD = Target.the("Create your password")
            .located(By.id("password"));
    public static final Target INPUT_CONFPASSWORD = Target.the("Confirm your password")
            .located(By.id("confirmPassword"));
    public static final Target TERM_USE = Target.the("check the option of terms of use")
            .located(By.name("termOfUse"));
    public static final Target PRIVACY_SETT = Target.the("check the privacy policy option")
            .located(By.name("privacySetting"));
    public static final Target COMPLETE_BUTTON = Target.the("button to send the form")
            .located(By.cssSelector(".btn.btn-blue"));
    public static final Target U_WELCOME = Target.the("Extract the welcome text from the page")
            .located(By.xpath("h1[contains(text(),'Welcome to the world's largest community of freelance software testers!/h1')]"));
}
