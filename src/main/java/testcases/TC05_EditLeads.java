package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC05_EditLeads extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC05_EditLead";
		testCaseName 	= "TC03 - FindLeads (POM)";
		testDescription = "FindLeads in Opentaps using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void editLead(String username,String password,String loginName,String companyName,String firstName,String lastName,String companyNameEdit, String firstNameEdit, String lastNameEdit) {
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
		.clickEditButton()
		.editFirstName(firstNameEdit)
		.editLastName(lastNameEdit)
		.editCompanyName(companyNameEdit)
		.clickUpdate();
	}
}
