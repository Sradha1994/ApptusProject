package apptusProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import apptusProject.Resources.base;

public class LandingPage extends base {
	WebDriver driver;
	
	@FindBy(css ="a[class='login']") 
	private WebElement signin;
	
	public LandingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSignIn() {
		signin.click();
	}
}
