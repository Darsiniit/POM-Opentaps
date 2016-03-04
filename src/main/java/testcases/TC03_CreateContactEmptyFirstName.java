package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.OpentapsWrappers;

public class TC03_CreateContactEmptyFirstName extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "TC02_CreateContactEmptyFirstName";
		testCaseName 	= "TC01-Create Contact First Name Empty (POM)";
		testDescription = "Create Contacts in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createContact(String username,String password, String loginName,  String firstName, String lastName) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCrmsfa()
		.clickCreateContact()
		.enterFirstName(firstName)
		.enterLasttName(lastName)
		.clickCreateContactEmptyFirstName().getFirstNameErrorMessage();
	}
		
}
