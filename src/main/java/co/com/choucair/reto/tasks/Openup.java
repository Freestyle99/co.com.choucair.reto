package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Openup implements Task {
    private UTestPage uTestPage;
    public static Openup thePage() {
        return Tasks.instrumented(Openup.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(uTestPage));
    }
}
