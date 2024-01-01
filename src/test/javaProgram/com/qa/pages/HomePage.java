package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.qa.BaseTest;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BaseTest{
	@AndroidFindBy(id = "com.abc.abd/balance") private WebElement Balance;
	
	public String getBalance() {
		String balance = getText(Balance);
		return balance;
	}

}
