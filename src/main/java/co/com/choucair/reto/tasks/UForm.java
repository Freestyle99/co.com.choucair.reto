package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.UFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class UForm implements Task{
    private String strFName;
    private String strLName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strPassword;
    private String strConfPassword;

    public UForm(String strFName,String strLName,String strEmail,String strMonth,String strDay,String strYear,
                 String strPassword, String strConfPassword) {
        this.strFName = strFName;
        this.strLName = strLName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strPassword = strPassword;
        this.strConfPassword = strConfPassword;
    }


    public static Performable the(String strFName, String strLName, String strEmail, String strMonth, String strDay,
                                  String strYear, String strPassword, String strConfPassword) {

        return Tasks.instrumented(UForm.class,strFName,strLName,strEmail,strMonth,strDay,strYear,strPassword,strConfPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strFName).into(UFormPage.INPUT_FINAME));
        actor.attemptsTo(Enter.theValue(strLName).into(UFormPage.INPUT_LANAME));
        actor.attemptsTo(Enter.theValue(strEmail).into(UFormPage.INPUT_EMAIL));
        actor.attemptsTo(SelectFromOptions.byVisibleText(strMonth).from(UFormPage.SELECT_MONTH));
        actor.attemptsTo(SelectFromOptions.byVisibleText(strDay).from(UFormPage.SELECT_DAY));
        actor.attemptsTo(SelectFromOptions.byVisibleText(strYear).from(UFormPage.SELECT_YEAR));
        actor.attemptsTo(Click.on(UFormPage.LOCATION_BUTTON));
        try {
            Thread.sleep(4*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(UFormPage.DEVICES_BUTTON));
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(UFormPage.LAST_BUTTON));
        actor.attemptsTo(Enter.theValue(strPassword).into(UFormPage.INPUT_CREPASSWORD));
        actor.attemptsTo(Enter.theValue(strConfPassword).into(UFormPage.INPUT_CONFPASSWORD));
        actor.attemptsTo(Click.on(UFormPage.TERM_USE));
        actor.attemptsTo(Click.on(UFormPage.PRIVACY_SETT));
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(UFormPage.COMPLETE_BUTTON));
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
