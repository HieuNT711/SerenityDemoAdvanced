package net.serenitybdd.demos.todos.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class TodoListApp {
    public static final Target MAIN_HEADING = Target.the("main heading").locatedBy("css:h1");
    public static final Target FOOTER = Target.the("footer").locatedBy(".info");
}
