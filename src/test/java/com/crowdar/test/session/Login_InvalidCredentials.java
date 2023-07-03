package com.crowdar.test.session;

import com.crowdar.steps.session.LoginMethods;
import com.crowdar.test.MainWebTest;
import com.crowdar.utils.AutoTool;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_InvalidCredentials extends MainWebTest {


    @Test
    public void loginInvalidCredentials(){
        LoginMethods login = new LoginMethods();

        login.completeLogin("standard_user","invalidPassword");

        Assert.assertTrue(AutoTool.getDriver().getPageSource().contains("Username and password do not match any user in this service"));

    }
}
