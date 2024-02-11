package com.entrata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import testcases.base.BasePage;

public class resident_login_page  extends BasePage {

	private By App_Visible = By.xpath("//div[@class='start-button app-button']");
	private By Website_Visible =By.xpath("//div[@class='start-button website-button']");
	private By How_to_Guidlines = By.xpath("(//a[@href='#app-videos'][normalize-space()='How-to Guides'])[2]");
	private By Features = By.xpath("//a[@href='#app-features'][normalize-space()='Features']");
	private By FAQs = By.xpath("//div[@class='landing-nav four-content']//a[@href='#four-faqs'][normalize-space()='FAQs']");
	private By Tips = By.xpath("//div[@class='landing-nav four-content']//a[@href='#app-tips'][normalize-space()='Tips']");
	private By Contact_us = By.xpath("//div[@class='landing-nav four-content']//a[@href='#app-contact'][normalize-space()='Contact Us']");
	
	private By Name = By.id("name");
	private By email = By.id("email");
	private By property_name = By.id("property_name");
	private By property_url = By.id("property_url");
	private By message = By.id("message");
	private By category = By.id("category");
	
	
	public void verfiy_Refident_ContactUs_Page() {
		clickonElement(By.xpath("//a[@title='Resident Portal Login Button']"));
		waitForVisibilityOfElements(By.xpath("//span[normalize-space()='Welcome to']"), driver);
		element_AssertTrue(By.xpath("//div[@class='start-button app-button']"));
		element_AssertTrue(App_Visible);
		clickonElement(Website_Visible);
		element_AssertTrue(Contact_us);
		element_AssertTrue(FAQs);
		element_AssertTrue(Features);
		element_AssertTrue(How_to_Guidlines);
		element_AssertTrue(Tips);
		clickonElement(Contact_us);
		waitForVisibilityOfElements(Name, driver);
		SendKeys(Name, "Faraz Dasurkar");
		SendKeys(email, "dasurkar.faraz@gmail.com");
		SendKeys(property_name, "Software Test Engineer");
		SendKeys(property_url, "https://www.linkedin.com/in/farazdasurkar/");
		SelectBytext(category, "Payments");
		SendKeys(message,"Hi Dear Hiring manager, This is Demo Application Automated Ussing Selenium Java  " );
		
	}
}
