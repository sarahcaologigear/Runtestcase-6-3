package com.auto.test.browser;

import com.auto.page.browser.RegisterPage;
import com.auto.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest extends BrowserTestBase {
    RegisterPage registerPage = new RegisterPage();
    @Test
    public void TC01_REG(){
        registerPage.setTabRegister();
        registerPage.enterEmail("cancaothi98855112335@gmail.com");
        registerPage.enterPassword("Caocan11@");
        registerPage.enterConfirmPassword("Caocan11@");
        registerPage.enterPassport("111222334");
        registerPage.clickRegisterButton();
        Assert.assertEquals(registerPage.msgSuccessRegister(),Constants.MSG_SUCCESS_REGISTER);
    }
}
