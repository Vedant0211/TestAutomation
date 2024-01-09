package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.qa.BaseTest;

import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage extends BaseTest{
	@AndroidFindBy(id = "com.abc.abd/userNameEditText") private WebElement usernameTxtFld;
	@AndroidFindBy(id = "com.abc.abc:id/passwordEditText") private WebElement passwordTxtFld;
	@AndroidFindBy(id = "com.abc.abc:id/loginTextView") private WebElement loginBtn;
	@AndroidFindBy(id = "com.abc.abc:id/textViewMsg") private WebElement Popup;
	@AndroidFindBy(id = "android:id/button1") private WebElement OkBtn;
	@AndroidFindBy(id = "android:id/button2") private WebElement CancelBtn;
	@AndroidFindBy(className = "android.widget.ImageButton")  private WebElement profileIcon;
	@AndroidFindBy(id = "com.abc.abd/userNameEditText") private WebElement ForgetPassword;
	public  ForgotPasswordPage pressForgotpass() {
		click(ForgetPassword);
		return new ForgotPasswordPage();
	}
	public LoginPage enterUserName(String username) {
		sendKeys(usernameTxtFld, "Login With :-"+username);
		return this;
	}
	public LoginPage enterUserNameforloginOnly(String username) {
		sendKeys(usernameTxtFld, username);
		return this;
	}
	public LoginPage enterPassword(String password) {
		sendKeys(passwordTxtFld, password);
		return this;
	}
	public LoginPage enterPasswordforLoginOnly(String password) {
		sendKeys(passwordTxtFld, password);
		return this;
	}
	public LoginPage pressLoginBtn() {
		click(loginBtn);
		return this;
	}
	public LoginPage DisplayLoginBtn() {
		isDisplayed(loginBtn);
		return this;
	}
	public String getErrTxt() {
		String text = getText(Popup);
		return text;
	}
	
	
	public LoginPage pressokBtn() {
		click(OkBtn );
		return this;
	}
	

	public LoginPage pressCancelBtn() {
		click(CancelBtn);
		return this;
	}
	
	
}
