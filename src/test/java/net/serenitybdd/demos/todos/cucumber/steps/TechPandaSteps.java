package net.serenitybdd.demos.todos.cucumber.steps;

import io.cucumber.java.en.Given;

import net.serenitybdd.demos.todos.screenplay.tasks.techpanda.CommonPage;
import net.serenitybdd.screenplay.Actor;

public class TechPandaSteps {
    @Given("{actor} register account in LiveGuru99 successfully")
    public void jameRegisterAccountInLiveGuruSuccessfully(Actor actor) {
        actor.attemptsTo(CommonPage.registerAccount());
    }
}
