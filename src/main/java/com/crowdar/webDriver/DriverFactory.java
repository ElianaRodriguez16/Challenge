package com.crowdar.webDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    public static void setDriver(String driverType) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("chrome", "com.crowdar.webDriver.ChromeLoader");
        map.put("firefox", "com.crowdar.webDriver.FirefoxLoader");
        map.put("edge", "com.crowdar.webDriver.EdgeLoader");

        try {
            @SuppressWarnings("unchecked")
            Class<DriverLoaderInterface> theClass = (Class<DriverLoaderInterface>)Class.forName(map.get(driverType.toLowerCase()));
            DriverLoaderInterface driverLoader = theClass.getDeclaredConstructor().newInstance();

            driverLoader.loadDriver();
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }
}
