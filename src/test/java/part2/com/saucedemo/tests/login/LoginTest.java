package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTests;

public class LoginTest extends BaseTests {
    @Test
    public void testLoginErrorMessage(){
        loginPage.setUserNameField("standard_user");
        loginPage.setPasswordField("password");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
