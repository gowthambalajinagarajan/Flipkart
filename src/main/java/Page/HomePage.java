package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(xpath="(//*[@class='Wbt_B2 _1YVU3_'])[1]")
	private WebElement ElectronicsTab;

	@FindBy(xpath="(//*[@class='Wbt_B2 _1YVU3_'])[2]")
	private WebElement TVTab;
	
	@FindBy(xpath="(//*[@class='Wbt_B2 _1YVU3_'])[3]")
	private WebElement MenTab;
	
	@FindBy(xpath="(//*[@class='Wbt_B2 _1YVU3_'])[4]")
	private WebElement WomenTab;
	
	@FindBy(xpath="(//*[@class='Wbt_B2 _1YVU3_'])[5]")
	private WebElement BabyTab;
	
	@FindBy(xpath="(//*[@class='Wbt_B2 _1YVU3_'])[6]")
	private WebElement HomeTab;
	
	@FindBy(xpath="(//*[@class='Wbt_B2 _1YVU3_'])[7]")
	private WebElement SportsTab;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getElectronicTab() {
		return ElectronicsTab;
	}
	
	public WebElement getTVTab() {
		return TVTab;
	}
	
	public WebElement getMenTab() {
		return MenTab;
	}
	
	public WebElement getWomenTab() {
		return WomenTab;
	}
	
	public WebElement getBabyTab() {
		return BabyTab;
	}
	
	public WebElement getHomeTab() {
		return HomeTab;
	}
	
	public WebElement getSportsTab() {
		return SportsTab;
	}
	
	public void ClickElectronicTab() {
		ElectronicsTab.click();
	}
	
	public void ClickTVTab() {
		TVTab.click();
	}
	
	public void ClickMenTab() {
		MenTab.click();
	}
	
	public void ClickWomenTab() {
		WomenTab.click();
	}
	public void ClickBabyTab() {
		BabyTab.click();
	}
	public void ClickHomeTab() {
		HomeTab.click();
	}
	public void ClickSportsTab() {
		SportsTab.click();
	}
}