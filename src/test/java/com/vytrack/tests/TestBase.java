package com.vytrack.tests;

import com.vytrack.utilities.ConfigReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("env1"));
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
