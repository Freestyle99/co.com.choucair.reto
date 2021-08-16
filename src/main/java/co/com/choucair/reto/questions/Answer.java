package co.com.choucair.reto.questions;

import co.com.choucair.reto.userinterface.UFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<String> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public String answeredBy(Actor actor) {
        String result;
        String uWELCOME = Text.of(UFormPage.U_WELCOME).viewedBy(actor).asString();
        if(question.equals(uWELCOME)){
            result = String.valueOf(true);
        }else{
            result = String.valueOf(false);
        }
        return result;
    }
}