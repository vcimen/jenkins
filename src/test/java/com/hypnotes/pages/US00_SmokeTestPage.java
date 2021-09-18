package com.hypnotes.pages;

import com.hypnotes.utilities.Driver;
import com.hypnotes.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US00_SmokeTestPage {
 public US00_SmokeTestPage() {
  PageFactory.initElements(Driver.getDriver(), this);
 }
////Login
 @FindBy(xpath = "//a[@href='/api/login']")
 public WebElement loginButton;
 @FindBy(xpath = "//input[@name='email']")
 public WebElement emailBox;
 @FindBy(xpath = "//input[@name='password']")
 public WebElement passwordBox;
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement loginButton1;

////////
 @FindBy(xpath = " //h3[contains(text(),'Search Clients')]")
 public WebElement afterLogin;
 @FindBy(xpath = " //a[contains(text(),'Wrong')]")
 public WebElement wrongCreText;
 @FindBy(xpath = "//a[@href='/api/logout']")
 public WebElement logoutButton;

//Add/Delete New Client
 @FindBy(xpath = "//a[@href='/dashboard/add-client']")
 public WebElement addClientButton;
 @FindBy(id = "first_name")
 public WebElement firstNameBox;
 @FindBy(id = "last_name")
 public WebElement lastNameBox;
 @FindBy(id = "phone")
 public WebElement phoneNumberBox;
 @FindBy(id = "occupation")
 public WebElement occupationBox;
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement addButton;
 @FindBy(id = "inputGroupFile01")
 public WebElement imgBox;
 @FindBy(xpath = "//li[@class='ant-menu-item'][1]")
 public WebElement clientsButton;
 @FindBy(xpath = " //html")
 public WebElement wholePage;
 @FindBy(xpath = " //span[@class='ant-typography ant-typography-danger']")
 public WebElement deleteButton;
 @FindBy(xpath = " //button/span[contains(text(),'Yes')]")
 public WebElement yesButton;
 @FindBy(xpath = "//a[@href='/dashboard/services']")
 public WebElement servicesButton;
 @FindBy(xpath = "//span[contains(text(),'Add New Category')]")
 public WebElement addNewCategoryButton;


//Add/Delete new category
 //@FindBy(xpath = "//input[@placeholder='Please enter a name']")
@FindBy(id ="title")
 public WebElement addNewCategoryNameBox;
 @FindBy(id= "price")
 public WebElement addNewCategoryPriceBox;
 @FindBy(id= "duration")
 public WebElement  addNewCategoryDurationDropDown;
 @FindBy(xpath= " //div[@class='rc-virtual-list-holder-inner']/div[1]/div")
 public WebElement duration30Minutes;
 @FindBy(id= "blockBefore")
 public WebElement  blockBeforeBox;
 @FindBy(id= "blockAfter")
 public WebElement blockAfterBox;
 @FindBy(id= "paymentRequired")
 public WebElement paymentRequiredButton;
 @FindBy(id= "description")
 public WebElement descriptionBox;
 @FindBy(xpath= "//button[@type='submit']")
 public WebElement saveButton;
 @FindBy(xpath= "//div[contains(text(),'NewCategory1')]/parent::div/parent::div/parent::div//parent::div/ul/li[2]/span/span/*")
 public WebElement categoryDeleteButton;
 @FindBy(xpath= "//span[contains(text(),'OK')]")
 public WebElement categoryDeleteOKButton;

 //Add/Delete New Package
 @FindBy(id= "rc-tabs-0-tab-2")
 public WebElement packageTab;
 @FindBy(xpath= "//span[contains(text(),'Add New Package')]")
 public WebElement addNewpackageButton;
 @FindBy(xpath= "(//div/div/div/input[@placeholder='Please enter a name'])[2]")
 public WebElement packageNameBox;
 @FindBy(xpath= "(//div/input [@id='price'])[2]")
 public WebElement packagePriceBox;
 @FindBy(xpath= "(//input[@id='duration'])[2]")
 public WebElement packageDurationBox;
 @FindBy(xpath= " (//div[@class='rc-virtual-list-holder-inner']/div[1]/div)[2]")
 public WebElement packageDuration30Minutes;
 @FindBy(xpath= "(//button/div[@class='ant-switch-handle'])[2]")
 public WebElement blockExtraTimeButton;
 @FindBy(xpath= "(//input[@id='blockBefore'])[2]")
 public WebElement packageBlockBeforeBox;
 @FindBy(xpath= "//input[@id='afterBlock']")
 public WebElement packageBlockAfterBox;
 @FindBy(xpath= "(//button[@id='paymentRequired'])[2]")
 public WebElement packagePaymentRequiredbutton;
 @FindBy(id= "totalSessions")
 public WebElement totalSessionsBox;
 @FindBy(id= "sessionInterval")
 public WebElement sessionIntervalBox;
 @FindBy(xpath= "(//textarea[@id='description'])[2]")
 public WebElement packageDescriptionBox;
 @FindBy(xpath= " (//button[@type='submit'])[2]")
 public WebElement packageSaveButton;
 @FindBy(xpath= "  //div[contains(text(),'NewPackage1')]/parent::div/parent::div/parent::div/parent::div/ul/li[2]")
 public WebElement newPackageDeleteButton;

 @FindBy(xpath= " //span[contains(text(),'OK')]")
 public WebElement packageDeleteOKButton;

}
