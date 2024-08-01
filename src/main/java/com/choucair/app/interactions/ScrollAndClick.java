package com.choucair.app.interactions;

import com.choucair.moviles.libreria.interactions.choucair.builders.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class ScrollAndClick implements Interaction {
    Target target;

    public ScrollAndClick(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.on(target),
                Click.on(target)
        );
    }

    public static ScrollAndClick scrollAndClick(Target target) {
        return Tasks.instrumented(ScrollAndClick.class, target);
    }
}
