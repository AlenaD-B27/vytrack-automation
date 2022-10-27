package com.vytrack.tests;


import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigReader;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {



    @Test
    public void test_login() {

        LoginPage loginPage = new LoginPage();

        //enter username
        //enter password
        //click the login button

        String driver_username = ConfigReader.getProperty("driver_username");
        String driver_password = ConfigReader.getProperty("driver_password");

        loginPage.login(driver_username, driver_password);
        //verify page header

        loginPage.waitUntilLoaderMaskVisibility();

        BrowserUtils.verifyTitle("Dashboard");

    }


}
