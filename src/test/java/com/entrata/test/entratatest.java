package com.entrata.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.entrata.pages.EntrataMainPage;
import com.entrata.pages.resident_login_page;

import testcases.base.BaseTest;

public class entratatest extends BaseTest{
	EntrataMainPage Main;
	resident_login_page resident;
	
	@Test
	public void Verify_Signin_with_Email_ID() {
		Main = new EntrataMainPage();
		Main.LoadURL("https://www.entrata.com/");
		// Lauch URL 
		Main.Landing_MainPage()    // Land on Main page if website and Check Assert for multiple Field
		.wait_click_SignIn()		// Wait and click on SignIn Button also Checking if is clickable or Not
		.Validate_signIn_Page()		// Checking Detials and validate in Sign in page
		.DetailformSignInpage()			// Click on Sign In page and Redrirect to Login Page
		.validation_with_EmailID_LoginPage("Test@gmail.com");	// Enter email ID and Chek the Validate Message
		System.out.println("Test Case Pass");
			
		
	}
	
	@Test
	public void Verify_SignIn_With_password() {
		Main = new EntrataMainPage();
		Main.LoadURL("https://www.entrata.com/");
		// Lauch URL 
		Main.Landing_MainPage()    // Land on Main page if website and Check Assert for multiple Field
		.wait_click_SignIn()		// Wait and click on SignIn Button also Checking if is clickable or Not
		.Validate_signIn_Page()		// Checking Detials and validate in Sign in page
		.DetailformSignInpage()			// Click on Sign In page and Redrirect to Login Page
		.validation_with_password_LoginPage("Test@123");	// Enter Password and Chek the Validate Message
		System.out.println("Test Case Pass");
	}
	
	@Test
	public void verify_WithInvalid_credentail() {
		Main = new EntrataMainPage();
		Main.LoadURL("https://www.entrata.com/");
		// Lauch URL 
		Main.Landing_MainPage()    // Land on Main page if website and Check Assert for multiple Field
		.wait_click_SignIn()		// Wait and click on SignIn Button also Checking if is clickable or Not
		.Validate_signIn_Page()		// Checking Detials and validate in Sign in page
		.DetailformSignInpage()			// Click on Sign In page and Redrirect to Login Page
		.Invalid_EmailID_Password("entrata@gmail.com", "Entrata@123"); // Enter Wrong  Email ID And paasword to Check the validation msg
		System.out.println("Test Case Pass");
		
	}
	
	@Test
	public void verify_with_ContactPage() {
		Main = new EntrataMainPage();
		resident = new resident_login_page();
		Main.LoadURL("https://www.entrata.com/");
		// Lauch URL 
		Main.Landing_MainPage()    // Land on Main page if website and Check Assert for multiple Field
		.wait_click_SignIn();	 // Click on Sign in Button 
		resident.verfiy_Refident_ContactUs_Page(); // Verified Resident Page and Fill Contact Form
		
		
	}
	
	

}
