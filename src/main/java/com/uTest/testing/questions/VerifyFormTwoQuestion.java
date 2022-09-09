package com.uTest.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.uTest.testing.userInterfaces.uTestSingUpPage.*;

public class VerifyFormTwoQuestion implements Question<String> {

    public static Question<String> verifyFormTwoQuestion(){
        return actor -> SPN_TITLE_FORM2.resolveFor(actor).getTextValue();
    }
    @Override
    public String answeredBy(Actor actor) {
        return SPN_TITLE_FORM2.resolveFor(actor).getTextValue();
    }
}
