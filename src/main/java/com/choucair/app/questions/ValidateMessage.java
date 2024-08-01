package com.choucair.app.questions;

import com.choucair.app.userinterface.UIHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidateMessage implements Question<Boolean> {
    String mensaje;

    public ValidateMessage(String mensaje) {
        this.mensaje = mensaje;
    }

    public static ValidateMessage verifiedPayment(String mensaje) {
        return new ValidateMessage(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(UIHome.BALANCE_MESAGE_TXT, WebElementStateMatchers.isPresent()).forNoMoreThan(3).seconds()
        );

        return mensaje.contains(Text.of(UIHome.BALANCE_MESAGE_TXT).answeredBy(actor));
    }
}
