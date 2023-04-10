package net.serenitybdd.demos.todos.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.demos.todos.screenplay.user_interface.TodoList.WHAT_NEEDS_TO_BE_DONE;
import static org.openqa.selenium.Keys.RETURN;

public class AddATodoItem {
//    private String thingToDo;
//
//    public AddATodoItem(String thingToDo) {
//        this.thingToDo = thingToDo;
//    }
//    public AddATodoItem() {}
//    public static AddATodoItem called(String thingToDo) {
//        return new AddATodoItem(thingToDo);
//    }
//
//    @Override
//    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(
//                Enter.theValue(thingToDo)
//                        .into(WHAT_NEEDS_TO_BE_DONE)
//                        .thenHit(Keys.RETURN)
//        );
//    }

    public static Task called(String thingToDo) {
        return Task.where("{0} adds a todo item called: #thingToDo",
                Enter.theValue(thingToDo)
                        .into(WHAT_NEEDS_TO_BE_DONE)
                        .thenHit(RETURN)
                ).with("thingToDo").of(thingToDo);
    }


}
