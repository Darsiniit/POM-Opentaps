package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC06_DeleteContact extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC06_DeleteContact";
		testCaseName 	= "TC05 - DleteContact (POM)";
		testDescription = "FindContact in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password,String loginName,String firstName,String lastName) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)  
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCrmsfa()
		.navigateToContactPage()
		.navigateToFindContactPage()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickFindContactbutton()
		.clickSearchResult()
		.ClickDeletebutton();
		

	}	
	}
