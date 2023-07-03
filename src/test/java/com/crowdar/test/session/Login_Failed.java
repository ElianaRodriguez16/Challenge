package com.crowdar.test.session;

import com.crowdar.steps.session.LoginMethods;
import com.crowdar.test.MainWebTest;
import com.crowdar.utils.AutoTool;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Failed extends MainWebTest {


    @Test
    public void loginFailed(){
        LoginMethods login = new LoginMethods();

        login.completeLogin("standard_user","failed");

        Assert.assertTrue(AutoTool.getDriver().getPageSource().contains("Products"));

    }
}
