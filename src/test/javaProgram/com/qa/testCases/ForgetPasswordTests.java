package com.qa.testCases;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgetPasswordTests {
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
		ForgetPasswordTests fp=new ForgetPasswordTests();
	}

	@AfterMethod
	public void afterMethod() {
		//closeApp();
		// afterTest();
	}


	@Test
	public void Test_Click_The_Forgot_Password_link() {
		
	}
	@Test
	public void TestForgetPassword() {
		
	}
}
