package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MenuPage extends OpentapsWrappers {
	public MenuPage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}

  public LeadsPage navigateToLeadPage() {
	  clickByLink(prop.getProperty("MenuPage.Leads.LinkText"));
	  return new LeadsPage();
	  
  }
  
  public MyContactPage navigateToContactPage(){
	  clickByLink(prop.getProperty("MenuPage.Contacts.LinkText"));
	  return new MyContactPage();
  }
	  
//Click on Create Contact
	public CreateContactPage clickCreateContact() {
		clickByLink(prop.getProperty("MenuPage.CreateContact.LinkText"));
		return new CreateContactPage();
	}
	
	//Click on Create Lead
		public CreateLeadPage clickCreateLead() {
			clickByLink(prop.getProperty("MenuPage.CreateLead.LinkText"));
			return new CreateLeadPage();
		}
  }

