package com.auto.utils;

import com.auto.page.browser.LoginPage;
import com.logigear.element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static WebDriver WEBDRIVER;
    public static String MSG_SUCCESS_REGISTER = String.format("You're here");
    public static final Map<String, String> ConfigFiles = new HashMap<>();
    public static final int LOADING_TIME = 5;
    public static final int LONG_TIME = 60;
}


