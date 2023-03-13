package com.auto.page.browser;

import com.auto.utils.Constants;
import com.logigear.element.Element;
import org.openqa.selenium.By;

public class RegisterPage extends GeneralPage{
    private final Element txtEmail = new Element(".//input[@id='email']");
    private final Element txtPassword = new Element(".//input[@id='password']");
    private final  Element txtConfirmPassword = new Element(".//input[@id='confirmPassword']");
    private final Element txtPassport = new Element(".//input[@id='pid']");
    private final Element btnSubmit = new Element(".//input[@type='submit']");
    private  Element msgSuccessRegister =new Element(".//div[@id='content']/p");

    public void setTabRegister() {
        this.tabRegister.click();
    }

    public void enterEmail(String Email){
        this.txtEmail.enter(Email);
    }

    public void enterPassword(String Password){
        this.txtPassword.enter(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword){
        this.txtConfirmPassword.enter(ConfirmPassword);
    }

    public void enterPassport(String Passport){
        this.txtPassport.enter(Passport);
    }

    public void clickRegisterButton(){
        this.btnSubmit.scrollToView();
        this.btnSubmit.click();
    }

    public String msgSuccessRegister(){
        return this.msgSuccessRegister.getText();
    }
}
