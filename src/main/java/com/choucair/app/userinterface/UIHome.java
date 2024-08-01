package com.choucair.app.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIHome {
    public static final Target MAKE_PAIMENT_BTN = Target.the("Boton para realizar pago").located(AppiumBy.id("com.experitest.ExperiBank:id/makePaymentButton"));
    public static final Target BALANCE_MESAGE_TXT = Target.the("mensaje del balance").located(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"com.experitest.ExperiBank:id/scrollView1\"]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView"));
    public static final Target MORTAGAGE_REQUEST_BTN = Target.the("boton para ingresar Mortgage request").located(AppiumBy.id("com.experitest.ExperiBank:id/mortageRequestButton"));
}
