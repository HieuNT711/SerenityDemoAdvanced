package net.serenitybdd.demos.todos.screenplay.user_interface.techpanda;

import net.serenitybdd.screenplay.targets.Target;

public class CommonPageElement {
    public static final Target BTN_ACCOUNT = Target.the("").locatedBy("//span[@class='label'][normalize-space()='Account']");
    public static final Target BTN_REGISTER = Target.the("").locatedBy("//a[normalize-space()='Register']");
}
