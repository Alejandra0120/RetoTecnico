package com.uTest.testing.tasks;

import com.sun.source.doctree.EndElementTree;
import com.uTest.testing.utils.UserEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.openqa.selenium.Keys;

import static com.uTest.testing.utils.UserEnum.*;
import static com.uTest.testing.userInterfaces.uTestSingUpPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class SignUpTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(the(SPN_TITLE_FORM), isVisible()));
        actor.attemptsTo(Enter.theValue(USER_NAME.getValue()).into(INP_FIRS_TNAME),
                Enter.theValue(USER_LASTNAME.getValue()).into(INP_LAST_NAME),
                Enter.theValue(USER_EMAIL.getValue()).into(INP_EMAIL));
        actor.wasAbleTo(SelectFromOptions.byVisibleText(USER_MONTH.getValue()).from(SLC_MONTH),
                SelectFromOptions.byVisibleText(USER_DAY.getValue()).from(SLC_DAY),
                SelectFromOptions.byVisibleText(USER_YEAR.getValue()).from(SLC_YEAR),
                Click.on(INP_LANGUAGE),
                Enter.theValue(USER_LANGUAGE.getValue()).into(INP_LANGUAGE),
                Click.on(BTN_NEXT_LOCATION));

    }

    public static SignUpTask signUpTask() {
        return Tasks.instrumented(SignUpTask.class);
    }
}
