package net.serenitybdd.demos.todos.screenplay.tasks.techpanda;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;


import static core.GlobalVariables.*;
import static net.serenitybdd.demos.todos.screenplay.user_interface.techpanda.CommonPageElement.BTN_ACCOUNT;
import static net.serenitybdd.demos.todos.screenplay.user_interface.techpanda.CommonPageElement.BTN_REGISTER;

import static net.serenitybdd.demos.todos.screenplay.user_interface.techpanda.RegisterPageElement.*;


public class CommonPage {
    public static Performable registerAccount() {
        return Task.where("{0} navigate to the page",
                Open.browserOn().thePageNamed("home.page"),
                Click.on(BTN_ACCOUNT),
                Click.on(BTN_REGISTER),
                Enter.theValue(FIRST_NAME).into(TXT_FIRST_NAME),
                Enter.theValue(LAST_NAME).into(TXT_LAST_NAME),
                Enter.theValue(EMAIL_ADDRESS).into(TXT_EMAIL_ADDRESS),
                Enter.theValue(PASS_WORD).into(TXT_PASSWORD),
                Enter.theValue(PASS_WORD).into(TXT_CONFIRM_PASSWORD)
        );
    }
}
