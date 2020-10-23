package apptusProject.PageObject;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import apptusProject.Resources.base;

public class TShirtPage extends base {
	
	WebDriver driver;
	
	
	@FindBy(css="a[title='Faded Short Sleeve T-shirts']")
	public WebElement productClick;
	
	public TShirtPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnProduct() {
		
		productClick.click();
	}
}
