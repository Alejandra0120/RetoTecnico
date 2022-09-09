package com.uTest.testing.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestSingUpPage {
    public static final Target SPN_TITLE_FORM = Target.the("TITLE FORM").located(By.xpath("//span[text()='Tell us about yourself']"));
    public static final Target INP_FIRS_TNAME = Target.the("ENTER A FIRST NAME").located(By.id("firstName"));
    public static final Target INP_LAST_NAME = Target.the("ENTER A LAST NAME").located(By.id("lastName"));
    public static final Target INP_EMAIL = Target.the("ENTER AN EMAIL ADDRESS").located(By.id("email"));
    public static final Target SLC_MONTH = Target.the("SELECT BIRTH MONTH").located(By.id("birthMonth"));
    public static final Target SLC_DAY = Target.the("SELECT BIRTH DAY").located(By.id("birthDay"));
    public static final Target SLC_YEAR = Target.the("SELECT BIRTH YEAR").located(By.id("birthYear"));
    public static final Target INP_LANGUAGE = Target.the("ENTER A LANGUAGE ").located(By.xpath("//input[@class='ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty']"));
    public static final Target BTN_NEXT_LOCATION = Target.the("BUTTON NEXT LOCATION").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target SPN_TITLE_FORM2 = Target.the("TITLE FORM 2").located(By.xpath("//span[text()='Add your address']"));


}
