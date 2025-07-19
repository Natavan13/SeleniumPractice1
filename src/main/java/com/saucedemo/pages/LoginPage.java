package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButtonField = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");

    public void setUserNameField(String userName) {
        setText(this.userNameField, userName);
    }

    public void setPasswordField(String password) {
        setText(this.passwordField, password);
    }

    public ProductsPage clickLoginButton() {
        click(this.loginButtonField);
        return new ProductsPage();
    }

    public ProductsPage loginIntoApplication(String username, String password){
        setUserNameField(username);
        setPasswordField(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        return findElement(this.errorMessage).getText();
    }

}
