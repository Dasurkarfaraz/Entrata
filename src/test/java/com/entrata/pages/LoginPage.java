package com.entrata.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import testcases.base.BasePage;

public class LoginPage extends BasePage {

	
	public LoginPage validation_with_EmailID_LoginPage(String email) {
		waitForVisibilityOfElements(By.xpath("//span[text()='Sign in']"), driver);
		SendKeys(By.xpath("//input[@id='entrata-username']"), email);
		clickonElement(By.xpath("//button[normalize-space()='Sign In']"));
		boolean LoginError_WithEmail = isElementPresent_By(By.xpath("//p[text()='Please enter username and password']"));
		Assert.assertEquals(LoginError_WithEmail, true);
		
		return this;
	}
public LoginPage validation_with_password_LoginPage(String password) {
	waitForVisibilityOfElements(By.xpath("//span[text()='Sign in']"), driver);
		SendKeys(By.xpath("//input[@id='entrata-password']"), password);
		clickonElement(By.xpath("//button[normalize-space()='Sign In']"));
		boolean LoginError_WithEmail = isElementPresent_By(By.xpath("//p[text()='Please enter username and password']"));
		Assert.assertEquals(LoginError_WithEmail, true);
		
		return this;
	}
public LoginPage Invalid_EmailID_Password(String email, String password) {
	waitForVisibilityOfElements(By.xpath("//span[text()='Sign in']"), driver);
	SendKeys(By.xpath("//input[@id='entrata-username']"), email);
	SendKeys(By.xpath("//input[@id='entrata-password']"), password);
	clickonElement(By.xpath("//button[normalize-space()='Sign In']"));
	boolean LoginError = isElementPresent_By(By.xpath("//p[contains(.,'The username and password provided')]"));
	Assert.assertEquals(LoginError, true);
	return this;
}

}
