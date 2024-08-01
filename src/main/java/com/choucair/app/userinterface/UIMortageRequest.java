package com.choucair.app.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIMortageRequest {

    public static final Target FIRST_NAME_INPUT = Target.the("Campo de texto first name").located(AppiumBy.id("com.experitest.ExperiBank:id/nameTextField"));
    public static final Target LAST_NAME_INPUT = Target.the("Campo de texto last name").located(AppiumBy.id("com.experitest.ExperiBank:id/lastNameTextField"));
    public static final Target AGE_INPUT = Target.the("Campo de texto age").located(AppiumBy.id("com.experitest.ExperiBank:id/ageTextField"));
    public static final Target ADDRESS_1_INPUT = Target.the("Campo de texto addres 1").located(AppiumBy.id("com.experitest.ExperiBank:id/addressOneTextField"));
    public static final Target ADDRESS_2_INPUT = Target.the("campo de texto addres 2").located(AppiumBy.id("com.experitest.ExperiBank:id/addressTwoTextField"));
    public static final Target BTN_SELECT_COUNTRY_INPUT = Target.the("boton seleccionar country").located(AppiumBy.id("com.experitest.ExperiBank:id/countryButton"));
    public static final Target NEXT_BTN = Target.the("boton boton next").located(AppiumBy.id("com.experitest.ExperiBank:id/nextButton"));
    public static final Target SELECT_COUNTRY = Target.the("boton seleccionar country").locatedBy(("//android.widget.TextView[@text='{0}']"));
    public static final Target SELEC_LIST_SECOND_PAGE = Target.the("sleccionar elementos de la lista").locatedBy(("//android.widget.CheckedTextView[@text='{0}']"));
    public static final Target BTN_SAVE = Target.the("Boton de guardar").located(AppiumBy.id("com.experitest.ExperiBank:id/saveButton"));
}
