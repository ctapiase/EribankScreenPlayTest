package com.choucair.app.tasks;

import com.choucair.app.interactions.ScrollAndClick;
import com.choucair.app.models.MortgageRequestModel;
import com.choucair.app.userinterface.UIHome;
import com.choucair.app.userinterface.UIMortageRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class FillFormMortage implements Task {

    MortgageRequestModel mortgageRequest;


    public FillFormMortage(MortgageRequestModel mortgageRequest) {
        this.mortgageRequest = mortgageRequest;
    }

    public static FillFormMortage fill(MortgageRequestModel mortgageRequest) {
        return Tasks.instrumented(FillFormMortage.class, mortgageRequest);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UIHome.MORTAGAGE_REQUEST_BTN),
                Enter.theValue(mortgageRequest.getFirstName()).into(UIMortageRequest.FIRST_NAME_INPUT),
                Enter.theValue(mortgageRequest.getLastName()).into(UIMortageRequest.LAST_NAME_INPUT),
                Enter.theValue(mortgageRequest.getAge()).into(UIMortageRequest.AGE_INPUT),
                Enter.theValue(mortgageRequest.getAddress1()).into(UIMortageRequest.ADDRESS_1_INPUT),
                Enter.theValue(mortgageRequest.getAddress2()).into(UIMortageRequest.ADDRESS_2_INPUT),
                Click.on(UIMortageRequest.BTN_SELECT_COUNTRY_INPUT),
                ScrollAndClick.scrollAndClick(UIMortageRequest.SELECT_COUNTRY.of(mortgageRequest.getCountry())),
                Click.on(UIMortageRequest.NEXT_BTN),
                ScrollAndClick.scrollAndClick(UIMortageRequest.SELEC_LIST_SECOND_PAGE.of(mortgageRequest.getNumberOfYears())),
                ScrollAndClick.scrollAndClick(UIMortageRequest.SELEC_LIST_SECOND_PAGE.of(mortgageRequest.getTypeLoan())),
                ScrollAndClick.scrollAndClick(UIMortageRequest.SELEC_LIST_SECOND_PAGE.of(mortgageRequest.getTypeOfOccupation())),
                ScrollAndClick.scrollAndClick(UIMortageRequest.SELEC_LIST_SECOND_PAGE.of(mortgageRequest.getYearlyIncome())),
                ScrollAndClick.scrollAndClick(UIMortageRequest.BTN_SAVE)
        );

    }
}
