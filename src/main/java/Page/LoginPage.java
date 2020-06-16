package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class LoginPage extends BasePage{

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement PassWord;
	
	@FindBy(xpath="(//*[@type='submit'])[2]")
	private WebElement LoginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getUserName() {
		return UserName;
	}
	
	public void SetUserName(String User) {
		setText(UserName, User);
	}
	
	public WebElement getPassWord() {
		return PassWord;
	}
	
	public void SetPassWord(String Pass) {
		setText(PassWord, Pass);
	}
	
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	public void ClickLoginButton() {
		LoginButton.click();
	}
}
