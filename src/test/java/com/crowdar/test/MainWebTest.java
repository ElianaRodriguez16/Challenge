package com.crowdar.test;

import com.crowdar.utils.AutoTool;
import com.crowdar.webDriver.DriverFactory;
import org.testng.annotations.*;

import static com.crowdar.utils.AutoTool.loadSetupValues;

public class MainWebTest {

    @BeforeSuite
    public void config(){
        loadSetupValues();
    }

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browser) {
        DriverFactory.setDriver(browser);
    }

    @AfterSuite
    public void cleanUp(){
        AutoTool.closeDriver();
    }
}
