package com.hypnotes.pages;

import com.hypnotes.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
    public CommonPage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }
    @FindBy( xpath = "//a[@href='/api/login']")
    public WebElement loginButton;

    @FindBy( xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy( xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy( xpath = "//button[@type='submit']")
    public WebElement loginButton1;

    @FindBy( xpath = "//a[@href='/api/logout']")
    public WebElement logoutButton;
}
