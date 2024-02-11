package com.entrata.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import testcases.base.BasePage;

public class SignInpage  extends BasePage{
	
	
	public SignInpage Validate_signIn_Page() {
		waitForVisibilityOfElements(By.xpath("//a[normalize-space()='Property Manager Login']"), driver);
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Entrata Sign In";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		boolean present_By_Pragraph = isElementPresent_By(By.xpath("//p[contains(text(),'If you are a property manager, login with your pro')]"));
		Assert.assertEquals(present_By_Pragraph, true);
		return this;
	}
	public  LoginPage DetailformSignInpage() {
		clickonElement(By.xpath("//a[normalize-space()='Property Manager Login']"));
		waitForVisibilityOfElements(By.xpath("//input[@id='entrata-username']"), driver);
		return new LoginPage();
	}

}
