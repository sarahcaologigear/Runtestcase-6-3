package com.auto.test.browser;

import com.auto.data.enums.Navigation;
import com.auto.page.browser.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BrowserTestBase {
    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "data_account")
    public void TC01(String tc01, String userName, String passWord) {
        String Username = "caocanhq@gmail.com";
        tc01.equals("TC01");
        loginPage.goToMenuTab(Navigation.LOGIN);
        loginPage.enterUsername(userName);
        loginPage.enterPassword(passWord);
        loginPage.clickOnLoginButton();
        String ExpectedResult = String.format("Welcome" + " " + Username);
        Assert.assertEquals(loginPage.getMessageSuccessLogin(), ExpectedResult);
    }

    @Test(dataProvider = "data_account")
    public void TC02(String tc02, String userName2, String passWord2){
        String errorMessage = "You must specify a username.";
        tc02.equals("TC02");
        loginPage.goToMenuTab(Navigation.LOGIN);
        loginPage.enterUsername(userName2);
        loginPage.enterPassword(passWord2);
        loginPage.clickOnLoginButton();
        String ExpectedResult = String.format(errorMessage);
        Assert.assertEquals(loginPage.showErrorMessage(Navigation.ERROR_MESSAGE_TC02), ExpectedResult);

    }
    @DataProvider(name = "data_account")
    private Object[][] dataAccount() {
        Object[][] data = {
                {"TC01","caocanhq@gmail.com","Caocan98@"},
                {"TC02","","Caocan98@"}
//                {}
        };
        return data;
    }
}
