package com.uTest.testing.utils;

public enum UserEnum {
    USER_NAME ("Lorena"),
    USER_LASTNAME("Rodriguez"),
    USER_EMAIL("lrodriguez@test.com"),
    USER_MONTH("January"),
    USER_DAY ("25"),
    USER_YEAR ("1993"),
    USER_LANGUAGE ("Spanish"),
    TITLE_FORM_2 ("Add your address");

    private String value;
    UserEnum(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }

}
