package com.crowdar.objects;

import com.crowdar.utils.AutoTool;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(AutoTool.getDriver(), this);
    }
}
