package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC07_DeleteLead extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC07_DeleteLeads";
		testCaseName 	= "TC04 - DleteLeads (POM)";
		testDescription = "FindLeads in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginForSuccess(String username,String password,String loginName,String companyName, String firstName,String lastName) {
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
		.clickFindLeadsbutton()
		.clickFirstItem()
		.ClickDeletebutton();

	}	
	}
