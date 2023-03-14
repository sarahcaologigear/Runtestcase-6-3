package com.auto.data.enums;

public enum Navigation {
    HOME("Home"),
    REGISTER("Register"),
    LOGIN("Login"),
    ITEMS("Items"),
    EXPENSES("Expenses"),
    ERROR_MESSAGE_TC02("You must specify a username.");

    private String value;

    Navigation(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
