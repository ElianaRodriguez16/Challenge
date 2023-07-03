package com.crowdar.steps.session;

import com.crowdar.objects.session.LoginPage;

public class LoginMethods {
    LoginPage loginPage = new LoginPage();

    public void completeLogin(String userVar, String passwordVar){

        loginPage.goWebPage();
        loginPage.setUserName(userVar);
        loginPage.setPassword(passwordVar);
        loginPage.clickLogin();

    }
}
