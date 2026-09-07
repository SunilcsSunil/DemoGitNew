package org.BlueNile.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bluenile_Login_Logout_Page {
 
//**************LOGIN CREDENTIALS XPATH**************
	
	@FindBy (xpath ="//button[@aria-label='Close']")
	private WebElement cookie;
	
	@FindBy (xpath = "//button[@class = 'login-form-container--RnY2O2bZgZ0uOG4BDNJt']")
	private WebElement clickOnLogin;
	
	@FindBy (xpath = "//input[@id = 'email']")
	private WebElement yourEmailAddress;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement yourPassword;
	
	@FindBy (xpath = "//button[text()='Login']")
	private WebElement submit;
//**************LOGIN CREDENTIALS XPATH DONE**************
	
	
//**************LOGOUT CREDENTIALS XPATH**************
    @FindBy (xpath = "//span[@data-qa='login-menu-item']")
    private WebElement logoutIcon;
    
    @FindBy (xpath = "//a[text() = 'Sign Out']")
    private WebElement logoutButton;
//**************LOGOUT CREDENTIALS XPATH DONE**************

    
//LAZY INITIALISATION

    
public Bluenile_Login_Logout_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



//GETTERS

public WebElement getCookie() {
	return cookie;
}

public WebElement getClickOnLogin() {
	return clickOnLogin;
}

public WebElement getYourEmailAddress() {
	return yourEmailAddress;
}

public WebElement getYourPassword() {
	return yourPassword;
}

public WebElement getSubmit() {
	return submit;
}

public WebElement getLogoutIcon() {
	return logoutIcon;
}
public WebElement getLogoutButton() {
	return logoutButton;
}
}