package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers {

	public ViewLeadPage() {

		if (!verifyTitle("View Lead | opentaps CRM")) {
			Reporter.reportStep("This is NOT View Lead page", "FAIL");
		}

	}

	public ViewLeadPage verifyFirstName(String firstName) {
		verifyTextContainsByXpath(prop.getProperty("ViewLead.FirstName.XPath"), firstName);
		return this;
	}
	
	public EditLeadsPage clickEditButton() {
		clickByXpath(prop.getProperty("ViewLeadsPage.ID.Xpath"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new EditLeadsPage();
	}
	
	public LeadsPage ClickDeletebutton() {
		  clickByXpath(prop.getProperty("ViewLeadListPage.LeadButton.Xpath"));
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return new LeadsPage();
	  }



}
