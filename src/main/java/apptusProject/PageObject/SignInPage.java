package apptusProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import apptusProject.Resources.base;

public class SignInPage extends base {
	WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(css="i[class='icon-lock left']")
	private WebElement signinbutton;
	
	public SignInPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void login(String un, String pwd){
		email.sendKeys(un);
		password.sendKeys(pwd);
		signinbutton.click();
	}
	

}
