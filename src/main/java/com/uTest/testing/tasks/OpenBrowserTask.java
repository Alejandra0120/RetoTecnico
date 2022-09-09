package com.uTest.testing.tasks;

import jxl.biff.StringHelper;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.uTest.testing.userInterfaces.uTestHomePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class OpenBrowserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://www.utest.com/"));
        actor.should(seeThat(the(SPN_MAIN_TITLE), isVisible()));
        actor.wasAbleTo(Click.on(BTN_SIGNUP));
    }
    public static OpenBrowserTask openBrowserTask(){
        return Tasks.instrumented(OpenBrowserTask.class);
    }
}
