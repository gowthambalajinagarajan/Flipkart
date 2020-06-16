package Steps;

import org.junit.Assert;

import Page.HomePage;
import Utility.BasePage;
import cucumber.api.java.en.*;

public class LoginPage2Test {

	BasePage bp;
	HomePage hp;
	
	public LoginPage2Test() {
		bp=new BasePage();
		hp=new HomePage();
	}
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	    hp=new HomePage();
	}

	@When("^User Click on the tab \"(.*?)\"$")
	public void user_Click_on_the_tab(String tab) throws Throwable {
	    if(tab.equals("Electronics")) {
	    	//System.out.println(hp.getElectronicTab().getText());
	    	hp.getElectronicTab().click();
	    }
	    else if(tab.equals("TV")) {
	    	System.out.println(hp.getTVTab().getText());
	    	hp.getTVTab().click();
	    }
	    else if(tab.equals("Men")) {
	    	System.out.println(hp.getMenTab().getText());
	    	hp.getMenTab().click();
	    }
	    else if(tab.equals("Women")) {
	    	System.out.println(hp.getWomenTab().getText());
	    	hp.getWomenTab().click();
	    }
	    else if(tab.equals("Baby")) {
	    	System.out.println(hp.getBabyTab().getText());
	    	hp.getBabyTab().click();
	    }
	    else if(tab.equals("Home")) {
	    	System.out.println(hp.getHomeTab().getText());
	    	hp.getElectronicTab().click();
	    }
	    else {
	    	System.out.println(hp.getSportsTab().getText());
	    	hp.getSportsTab().click();
	    }
	}

	/*@Then("^User should see the respective details page$")
	public void user_should_see_the_respective_details_page() throws Throwable {
	   if(hp.getElectronicTab().getText().equals("Electronics"))
		Assert.assertTrue("Pass", hp.getURL().contains(""));
	}*/

}
