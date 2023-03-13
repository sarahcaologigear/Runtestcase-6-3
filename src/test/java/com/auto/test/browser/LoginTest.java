package com.auto.test.browser;

import com.auto.page.browser.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BrowserTestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void TC01(){
            loginPage.clickLoginTab();
            loginPage.enterUsername("caocanhq@gmail.com");
            loginPage.enterPassword("Caocan98@");
            loginPage.clickOnLoginButton();
    }
}
