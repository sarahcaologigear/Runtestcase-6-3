package com.auto.page.browser;

import com.logigear.element.Element;
import org.checkerframework.checker.index.qual.PolyUpperBound;

public class LoginPage extends GeneralPage{
    private final Element txtUsername = new Element(".//input[@id='username']");
    private final Element txtPassword = new Element(".//input[@id='password']");
    private final Element btnLogin = new Element(".//input[@type='submit']");

    public void clickLoginTab(){
        this.tabLogin.click();
    }
    public void enterUsername(String Username){
        this.txtUsername.enter(Username);
    }

    public void enterPassword(String Password){
        this.txtPassword.enter(Password);
    }

    public void clickOnLoginButton(){
        this.btnLogin.click();
    }
}
