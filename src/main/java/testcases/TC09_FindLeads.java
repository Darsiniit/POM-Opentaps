package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC09_FindLeads extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC09_FindLeads";
		testCaseName 	= "TC03 - FindLeads (POM)";
		testDescription = "FindLeads in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password,String loginName,String firstName,String lastName, String companyName) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedinUserName(loginName)
		.clickCrmsfa()
		.navigateToLeadPage()
		.navigateToFindLeadsPage()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(companyName)
		.clickFindLeadsbutton();
	}
}
