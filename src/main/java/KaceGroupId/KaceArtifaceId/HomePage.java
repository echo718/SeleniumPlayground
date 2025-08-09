package KaceGroupId.KaceArtifaceId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;


public class HomePage extends AbstractComponent{
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(css="[class*='current-breadcrumb']")
	WebElement homePageMessage;
	
	public String getHomePageMessage()
	{
		//LandingPage cp = new LandingPage(driver);	
		return homePageMessage.getText();
	}
}
