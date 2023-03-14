package com.auto.page.browser;

import com.auto.data.enums.Navigation;
import com.logigear.element.Element;

public class RegisterPage extends GeneralPage{
    private final Element txtEmail = new Element(".//input[@id='email']");
    private final Element txtPassword = new Element(".//input[@id='password']");
    private final  Element txtConfirmPassword = new Element(".//input[@id='confirmPassword']");
    private final Element txtPassport = new Element(".//input[@id='pid']");
    private final Element btnSubmit = new Element(".//input[@type='submit']");
    private  Element msgSuccessRegister =new Element(".//div[@id='content']/p");


    public Element getTab(Navigation nameTab) {
        return new Element(tabRegister, nameTab.value());
    }

    public void goToMenuTab(Navigation nameTab) {
        this.getTab(nameTab).click();
    }

    public void enterEmail(String email){
        this.txtEmail.enter(email);
    }

    public void enterPassword(String password){
        this.txtPassword.enter(password);
    }

    public void enterConfirmPassword(String confirmPassword){
        this.txtConfirmPassword.enter(confirmPassword);
    }

    public void enterPassport(String passport){
        this.txtPassport.enter(passport);
    }

    public void clickRegisterButton(){
        this.btnSubmit.scrollToView();
        this.btnSubmit.click();
    }

    public String msgSuccessRegister(){
        return this.msgSuccessRegister.getText();
    }
}
