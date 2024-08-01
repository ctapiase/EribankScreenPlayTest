package com.choucair.app.tasks;

import com.choucair.app.userinterface.UILogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.logging.Logger;

public class LogIn implements Task {

 String user;
 String password;

    public LogIn(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static LogIn app(String user, String password){
        return Tasks.instrumented(LogIn.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre la app");
        actor.attemptsTo(
                Enter.theValue(user).into(UILogin.USERNAME_TXT),
                Enter.theValue(password).into(UILogin.PASSWORD_TXT),
                Click.on(UILogin.LOGIN_BTN)
        );
    }
}


