package com.entrata.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import testcases.base.BasePage;

public class EntrataMainPage extends BasePage {
	
	public SignInpage wait_click_SignIn()
	{
		clickonElement(By.xpath("(//a[text()='Sign In'])[1]"));
		
		return new SignInpage();
	}
	public EntrataMainPage Landing_MainPage() {
		CokieAccept();
		waitForclickability(By.xpath("(//a[text()='Watch Demo'])[3]"), driver);
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Property Management Software | Entrata";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		return this;
	}
	

}
