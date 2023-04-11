package net.serenitybdd.demos.todos.screenplay.user_interface.techpanda;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPageElement {
    public static final Target TXT_FIRST_NAME =
            Target.the("").locatedBy("//input[@id='firstname']");
    public static final Target TXT_LAST_NAME = Target.the("").locatedBy("//input[@id='lastname']");
    public static final Target TXT_EMAIL_ADDRESS =
            Target.the("").locatedBy("//input[@id='email_address']");
    public static final Target TXT_PASSWORD = Target.the("").locatedBy("//input[@id='password']");
    public static final Target TXT_CONFIRM_PASSWORD =
            Target.the("").locatedBy("//input[@id='confirmation']");
    public static final Target BTN_REGISTER_ =
            Target.the("").locatedBy("//button[@title='Register']");
    public static final Target BTN_REGISTER_SUCCESS =
            Target.the("")
                    .locatedBy(
                            "//span[normalize-space()='Thank you for registering with Main Website"
                                    + " Store.']");
}
