package com.crowdar.webDriver;

import com.crowdar.utils.AutoTool;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLoader {
    public void loadDriver() {
        String driverPath = "Drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverPath);

        if(AutoTool.getDriver()==null||!AutoTool.getDriver().getClass().toString().equals("class org.openqa.selenium.firefox.FirefoxDriver")) {
            AutoTool.setDriver(new FirefoxDriver());
        }
    }
}
