package com.choucair.app.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIMakePayment {
    public static final Target PHONE_INPUT = Target.the("Campo de texto phone").located(AppiumBy.id("com.experitest.ExperiBank:id/phoneTextField"));
    public static final Target NAME_INPUT = Target.the("Campo de texto name").located(AppiumBy.id("com.experitest.ExperiBank:id/nameTextField"));
    public static final Target AMOUNT_INPUT = Target.the("Campo de texto amount").located(AppiumBy.id("com.experitest.ExperiBank:id/amountTextField"));
    public static final Target BTN_SELECT_COUNTRY_INPUT = Target.the("boton seleccionar country").located(AppiumBy.id("com.experitest.ExperiBank:id/countryButton"));
    public static final Target SELECT_COUNTRY = Target.the("boton seleccionar country").locatedBy(("//android.widget.TextView[@text='{0}']"));
    public static final Target BTN_SEND_PAYMENT = Target.the("boton send payment").located(AppiumBy.id("com.experitest.ExperiBank:id/sendPaymentButton"));
    public static final Target BTN_ALERT_YES = Target.the("boton yes de la alerta").located(AppiumBy.id("android:id/button1"));

}
