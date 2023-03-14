package com.auto.page.browser;

import com.auto.data.enums.Navigation;
import com.logigear.element.Element;

public class LoginPage extends GeneralPage{
    private final Element txtUsername = new Element(".//input[@id='username']");
    private final Element txtPassword = new Element(".//input[@id='password']");
    private final Element btnLogin = new Element(".//input[@type='submit']");
    private final Element msgSuccess = new Element("//div[@class='account']//strong");
    private String errorMessage = "//div[@id='content']//label[contains(text(),'%s')]";

    public Element getTab(Navigation nameTab) {
        return new Element(tabLogin, nameTab.value());
    }

    public void goToMenuTab(Navigation nameTab) {
        this.getTab(nameTab).click();
    }

    public void enterUsername(String Username){
        this.txtUsername.enter(Username);
    }

    public void enterPassword(String Password){
        this.txtPassword.enter(Password);
    }

    public void clickOnLoginButton(){
        this.btnLogin.scrollToView();
        this.btnLogin.click();
    }

    public String getMessageSuccessLogin(){
       return this.msgSuccess.getText();
    }
    public Element getErrorMessage(Navigation nameError) {
        return new Element(errorMessage, nameError.value());
    }

    public String showErrorMessage(Navigation nameError) {
        return this.getErrorMessage(nameError).getText();
    }
}
