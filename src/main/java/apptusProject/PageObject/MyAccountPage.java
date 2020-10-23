package apptusProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import apptusProject.Resources.base;

public class MyAccountPage extends base {
WebDriver driver;

	@FindBy(css="ul[class='sf-menu clearfix menu-content sf-js-enabled sf-arrows'] > li:nth-child(3) > a") 
	private WebElement tshirt;
	
	public MyAccountPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnTShirt() {
		tshirt.click();
	}

}
