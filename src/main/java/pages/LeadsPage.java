package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LeadsPage extends OpentapsWrappers {
	public LeadsPage() {

		if(!verifyTitle("My Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}

  public FindLeadsPage navigateToFindLeadsPage() {
	  clickByXpath(prop.getProperty("Lead.FindLeadsLink.Xpath"));
	  return (new FindLeadsPage());
	  
  }
}
