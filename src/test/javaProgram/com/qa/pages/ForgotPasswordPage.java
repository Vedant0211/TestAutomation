package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.qa.BaseTest;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ForgotPasswordPage extends BaseTest{
	
	
	@AndroidFindBy(id = "com.abc.abd/ForgetPassword") private WebElement ForgetPassword;
	@AndroidFindBy(id = "com.abc.abc:id/emailEditText") private WebElement emailfield;
	@AndroidFindBy(id = "com.abc.abc:id/newpassEditText") private WebElement newPasswordfield;
	@AndroidFindBy(id = "com.abc.abc:id/confirmpassEditText") private WebElement confPasswordfield;
	@AndroidFindBy(id = "com.abc.abc:id/RecoverBtn") private WebElement RecoverBtn;
	@AndroidFindBy(id = "com.abc.abc:id/textViewMsg") private WebElement Popup;
	@AndroidFindBy(id = "android:id/Strenth") private WebElement Strenth;
	@AndroidFindBy(id = "android:id/button2") private WebElement SubmitBtn;
	@AndroidFindBy(className = "android.widget.ImageButton")  private WebElement profileIcon;

	public ForgotPasswordPage enterEmail(String email) {
		sendKeys(emailfield, email);
		return this;
	}

	public ForgotPasswordPage enternewPass(String newPassword) {
		sendKeys(newPasswordfield, newPassword);
		return this;
	}
	public ForgotPasswordPage enterConfPass(String confPassword) {
		sendKeys(confPasswordfield, confPassword);
		return this;
	}
	public ForgotPasswordPage pressRecoverBtn() {
		click(RecoverBtn);
		return this;
	}
	public String getErrTxt() {
		String text = getText(Popup);
		return text;
	}
	public String getStrenght() {
		String text = getText(Strenth);
		return text;
	}
	public ForgotPasswordPage pressSubmitBtn() {
		click(SubmitBtn);
		return this;
	}
	
	
}
