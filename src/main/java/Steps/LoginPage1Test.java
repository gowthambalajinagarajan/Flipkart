package Steps;

import org.junit.Assert;

import Page.LoginPage;
import Utility.BasePage;
import cucumber.api.java.en.*;

public class LoginPage1Test {

	BasePage bp;
	LoginPage lp;
	
	public LoginPage1Test() {
		bp=new BasePage();
		lp=new LoginPage();
	}
	
	@Given("^user launch the Application$")
	public void user_launch_the_Application() throws Throwable {
	  lp=new LoginPage();
	}

	@When("^user should enter the username and password$")
	public void user_should_enter_the_username_and_password() throws Throwable {
	   lp.SetUserName("9043178410");
	   lp.SetPassWord("balaji18");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    lp.ClickLoginButton();
	}

	@Then("^user should see Home Page$")
	public void user_should_see_Home_Page() throws Throwable {
	    Assert.assertTrue("Pass", bp.getURL().contains("flipkart"));
	}
}
