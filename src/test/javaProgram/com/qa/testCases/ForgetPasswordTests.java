package com.qa.testCases;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.ForgotPasswordPage;
import com.qa.pages.LoginPage;

public class ForgetPasswordTests {
	public ForgotPasswordPage fp;
	public LoginPage lp;
	@BeforeClass
	public void beforeClass() throws Exception {
		
	//	closeApp();
	//	launchApp();
	}

	@AfterClass
	public void afterClass() {
	}


	@BeforeMethod
	public void beforeMethod(Method m ) throws Exception {
		fp=new ForgotPasswordPage();
		lp=new LoginPage();
		
	}

	@AfterMethod
	public void afterMethod() {
		//closeApp();
		// afterTest();
	}


	@Test
	public void Test_Click_The_Forgot_Password_link() {
		lp.pressLoginBtn();
		lp.pressForgotpass();
		String text=fp.getErrTxt();
		assertEquals(text, "");
	}
	@Test
	public void TestForgetPassword() {
		lp.pressLoginBtn();
		lp.pressForgotpass();
		fp.enterEmail("");
		fp.pressRecoverBtn();
		String text=fp.getErrTxt();
		assertEquals(text, "");
		fp.enternewPass("");
		fp.enterConfPass("");
		fp.pressSubmitBtn();
		lp.pressLoginBtn();
		lp.enterUserName("");
		lp.enterPassword("");
		lp.pressLoginBtn();
		String popup= lp.getErrTxt();
		assertEquals(popup, "SucesssLogin");
		
	}
	@Test
	public void checkPasswordStrainth() {
		lp.pressLoginBtn();
		lp.pressForgotpass();
		fp.enterEmail("");
		fp.pressRecoverBtn();
		fp.enternewPass("");
		fp.enterConfPass("");
		String text=fp.getStrenght();
		assertEquals("High", text);
		
	}
		
}
