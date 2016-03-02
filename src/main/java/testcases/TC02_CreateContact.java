package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_CreateContact extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC02_CreateContact";
		testCaseName 	= "TC01-Create Lead (POM)";
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
		.clickCreateContact()
		.verifyFirstName(firstName)
		;
	}
		
}
