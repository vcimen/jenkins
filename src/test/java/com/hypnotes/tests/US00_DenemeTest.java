package com.hypnotes.tests;

import com.hypnotes.pages.US00_SmokeTestPage;
import com.hypnotes.utilities.ConfigurationReader;
import com.hypnotes.utilities.Driver;
import com.hypnotes.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US00_DenemeTest extends ReusableMethods {
     US00_SmokeTestPage US00DenemePage =new US00_SmokeTestPage();
     ReusableMethods reusableMethods=new ReusableMethods();
    @Test
public void loginTest() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("hypnotes_link"));
        US00DenemePage.loginButton.click();

        Thread.sleep(3000);
        US00DenemePage.emailBox.sendKeys(ConfigurationReader.getProperty("semra-email"));
        Thread.sleep(3000);
        US00DenemePage.passwordBox.sendKeys(ConfigurationReader.getProperty("semra-password"));
        Thread.sleep(3000);
        US00DenemePage.loginButton1.click();
        Thread.sleep(3000);


        Assert.assertTrue(US00DenemePage.afterLogin.isDisplayed());
        System.out.println("Login test passed");
        Thread.sleep(3000);
        ReusableMethods.clickWithJS(US00DenemePage.logoutButton);
        Thread.sleep(3000);

        // methodla login yapma--extendle alma
        login(ConfigurationReader.getProperty("semra-email"),ConfigurationReader.getProperty("semra-password"));
        //methodla logout yapma----extendle alma
        logout();

        // methodla login yapma--objeyle alma
        reusableMethods.login(ConfigurationReader.getProperty("semra-email"),ConfigurationReader.getProperty("semra-password"));
        // methodla logou yapma--objeyle alma
        reusableMethods.logout();
    }
}
