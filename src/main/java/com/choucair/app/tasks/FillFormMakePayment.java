package com.choucair.app.tasks;

import com.choucair.app.models.MakePaymentModel;
import com.choucair.app.userinterface.UIHome;
import com.choucair.app.userinterface.UIMakePayment;
import com.choucair.moviles.libreria.interactions.choucair.builders.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillFormMakePayment implements Task {
    MakePaymentModel paymentModel;

    public FillFormMakePayment(MakePaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }

    public static FillFormMakePayment fill (MakePaymentModel paymentModel) {
        return Tasks.instrumented(FillFormMakePayment.class, paymentModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UIHome.MAKE_PAIMENT_BTN),
                Enter.theValue(paymentModel.getPhone()).into(UIMakePayment.PHONE_INPUT),
                Enter.theValue(paymentModel.getName()).into(UIMakePayment.NAME_INPUT),
                Enter.theValue(paymentModel.getAmount()).into(UIMakePayment.AMOUNT_INPUT),
                Click.on(UIMakePayment.BTN_SELECT_COUNTRY_INPUT),
                Scroll.on(UIMakePayment.SELECT_COUNTRY.of(paymentModel.getCountry())),
                Click.on(UIMakePayment.SELECT_COUNTRY.of(paymentModel.getCountry())),
                Click.on(UIMakePayment.BTN_SEND_PAYMENT),
                Click.on(UIMakePayment.BTN_ALERT_YES)
        );
    }
}
