package com.uTest.testing.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestHomePage {

    public static final Target BTN_SIGNUP = Target.the("BUTTON FOR SIGN UP").located(By.xpath("//a[@class = 'unauthenticated-nav-bar__sign-up']"));
    public static final Target SPN_MAIN_TITLE = Target.the("MAIN TITLE ").located(By.xpath("//h1[text()='The Largest Community of Testers in the World']"));

}
