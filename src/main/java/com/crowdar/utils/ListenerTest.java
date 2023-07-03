package com.crowdar.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("The name of the testcase failed is :"+result.getName());
        try{
            AutoTool.FailedScreenshot(result.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
