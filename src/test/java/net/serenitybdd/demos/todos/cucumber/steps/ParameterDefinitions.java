package net.serenitybdd.demos.todos.cucumber.steps;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.core.annotations.events.AfterExample;
import net.serenitybdd.demos.todos.screenplay.tasks.DeleteAllTheItems;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ParameterDefinitions {
    @Before
    public void set_the_stage() {
        setTheStage(new OnlineCast());
    }

//    @AfterExample
//    public void deleteAllTheTasks() {
//        theActorInTheSpotlight().attemptsTo(
//                DeleteAllTheItems.onThePage()
//        );
//    }

    @ParameterType(".*")
    public Actor actor(String actor) {
        return OnStage.theActorCalled(actor);
    }
}
