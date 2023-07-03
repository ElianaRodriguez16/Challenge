package com.crowdar.test.session;

import com.crowdar.steps.session.LoginMethods;
import com.crowdar.test.MainWebTest;
import com.crowdar.utils.AutoTool;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_lockedOutUser extends MainWebTest {


    @Test
    public void loginLockedOutUser(){
        LoginMethods login = new LoginMethods();

        login.completeLogin("locked_out_user","secret_sauce");

        Assert.assertTrue(AutoTool.getDriver().getPageSource().contains("Sorry, this user has been locked out."));

    }
}
