package KaceGroupId.KaceArtifaceId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(css = "[name='LOGIN_NAME']")
	WebElement userEmail;
	
	@FindBy(css = "[name='LOGIN_PASSWORD']")
	WebElement passwordEle;
	
	@FindBy(id="button_login")
	WebElement submit;
	@FindBy(css="[class*='error-explanation']")
	WebElement errorMessage;

	public HomePage loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		HomePage homePage = new HomePage(driver);
		return homePage;

	}

	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}

	public void goTo() {
		driver.get("https://kace.stjohn.org.nz/userui/welcome.php");
	}

}
