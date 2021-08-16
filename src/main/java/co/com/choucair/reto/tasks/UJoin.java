package co.com.choucair.reto.tasks;

import co.com.choucair.reto.userinterface.UTestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class UJoin implements Task {
    public static UJoin onThePage() {
        return Tasks.instrumented(UJoin.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UTestJoinPage.JOIN_BUTTON));
    }
}
