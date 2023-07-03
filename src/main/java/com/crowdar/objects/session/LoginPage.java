package com.crowdar.objects.session;

import com.crowdar.objects.BasePage;
import com.crowdar.utils.AutoTool;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.crowdar.utils.AutoTool.getSetupValue;

public class LoginPage extends BasePage {
    @FindBy(how = How.ID, using = "user-name")
    WebElement txt_userName;

    @FindBy(how = How.ID, using = "password")
    WebElement txt_password;

    @FindBy(how = How.ID, using = "login-button")
    WebElement btn_login;

    public void goWebPage () {
        AutoTool.getDriver().get(getSetupValue("urlWebPage"));
    }

    public void setUserName(String userNameVar){
        txt_userName.sendKeys(userNameVar);
    }

    public void setPassword(String passwordVar){
        txt_password.sendKeys(passwordVar);
    }

    public void clickLogin(){
       btn_login.click();
    }
}
