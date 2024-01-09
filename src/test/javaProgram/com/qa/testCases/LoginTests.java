package com.qa.testCases;

import java.io.InputStream;
import java.lang.reflect.Method;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;



public class LoginTests extends BaseTest{
	
	LoginPage loginPage;
	HomePage homePage;
	@BeforeClass
	public void beforeClass() throws Exception {
		
	//	closeApp();
	//	launchApp();
	}

	@AfterClass
	public void afterClass() {
	}


	@BeforeMethod
	public void beforeMethod(Method m) throws Exception {
		loginPage=new LoginPage();
		homePage=new HomePage();
		loginPage.pressLoginBtn();
	}

	@AfterMethod
	public void afterMethod() {
		//closeApp();
		// afterTest();
	}


	@Test
	public void invalidLogincredentials() {
		loginPage.enterUserName("");
		loginPage.enterPassword("");
		loginPage.pressLoginBtn();
		String actuakErrTxt= loginPage.getErrTxt();
		String expextederrtext= getStrings().get("invalid_password");
		Assert.assertEquals(actuakErrTxt, expextederrtext);
		loginPage.pressokBtn();
	}
	@Test
	public void afterInvalidCredentials_shoundDisplayLoginPage() {
		loginPage.enterUserName("");
		loginPage.enterPassword("");
		loginPage.pressLoginBtn();
		String actuakErrTxt= loginPage.getErrTxt();
		String expextederrtext= getStrings().get("invalid_password");
		Assert.assertEquals(actuakErrTxt, expextederrtext);
		loginPage.pressokBtn();
		loginPage.DisplayLoginBtn();
	}
	public void disableLoginButtonWhenblankfields() {
		loginPage.DisplayLoginBtn();
		loginPage.pressLoginBtn();
		
	}

	@Test
	public void NotRegisterUserLogin() {
		loginPage.enterUserName("");
		loginPage.enterPassword("");
		loginPage.pressLoginBtn();
		String actuakErrTxt= loginPage.getErrTxt();
		String expextederrtext= getStrings().get("invalid_user");
		Assert.assertEquals(actuakErrTxt, expextederrtext);
		loginPage.pressokBtn();
	}

	@Test
	public void SuccessLogin() {
		loginPage.enterUserName("");
		loginPage.enterPassword("");
		loginPage.pressLoginBtn();
		String Balance= homePage.getBalance();
		if (Balance.isEmpty()) {
			//"Login Fail"
		}else {
			//"Login Pass"
		}


	}

}
