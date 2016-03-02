package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadsPage extends OpentapsWrappers {
	public EditLeadsPage() {

		if (!verifyTitle("opentaps CRM")) {
			Reporter.reportStep("This is NOT Edit Leads page", "FAIL");
		}

	}

	public EditLeadsPage editLastName(String lastNameEdit) {

		enterById(prop.getProperty("EditLeadsPage.LastName.ID"), lastNameEdit);
		return this;
	}

	public EditLeadsPage editFirstName(String firstNameEdit) {

		enterById(prop.getProperty("EditLead.Firstname.ID"), firstNameEdit);
		return this;
	}

	public EditLeadsPage editCompanyName(String companyNameEdit) {

		enterById(prop.getProperty("EditLeadsPage.CompanyName.ID"), companyNameEdit);
		return this;
	}

	public ViewLeadPage clickUpdate() {
		
		clickByXpath(prop.getProperty("EditLeadsPage.Update.Xpath"));
		return new ViewLeadPage();
	}

}
