package apptusProject.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import apptusProject.PageObject.*;
import apptusProject.Resources.Utils;
import apptusProject.Resources.base;

public class E2ETest extends base{
	
	
	LandingPage objLandingPage;
	SignInPage objSignInPage;
	MyAccountPage objMyAccountPage;
	TShirtPage objTShirtPage;
	FadedShortSleevePage objFadedShortSleevePage;
	Utils objUtil=new Utils();
	
	
	
	public E2ETest() {
		super();
	}
	
	@BeforeMethod
	public void testSetup() {
		testdata();
		setup();
		objLandingPage= new LandingPage(driver);
		objSignInPage=new SignInPage(driver);
		objMyAccountPage=new MyAccountPage(driver);
		objTShirtPage=new TShirtPage(driver);
		objFadedShortSleevePage=new FadedShortSleevePage(driver);
		
	}
	@Test
	public void testE2E() throws InterruptedException, AWTException
	{
		objLandingPage.ClickOnSignIn();
		objSignInPage.login(prop.getProperty("username"),prop.getProperty("password") );
		Thread.sleep(3000);
		objMyAccountPage.ClickOnTShirt();
		objTShirtPage.ClickOnProduct();
		objFadedShortSleevePage.ClickOnAddToCart();
		objFadedShortSleevePage.ProductCheck();
		
		String msg = objFadedShortSleevePage.MessageCheck();
		Assert.assertEquals(msg, "Product successfully added to your shopping cart");
		
		String msg2 = objFadedShortSleevePage.ProductCheck();
		System.out.println(msg2);
		
		/*String pnc = objFadedShortSleevePage.ProductNameCheck();
		System.out.println(pnc);
		
		String pac = objFadedShortSleevePage.ProductAttributeCheck();
		Assert.assertEquals(pnc, "Orange, S");
		
		String pqc = objFadedShortSleevePage.ProductQuantityCheck();
		Assert.assertEquals(pqc, "1");
		
		
		String ppc = objFadedShortSleevePage.ProductPriceCheck();
		Assert.assertEquals(ppc, "$16.51");*/
		
		
	}
	@AfterMethod
	public void testTerminate() {
	driver.quit();
	}
	
	
	

}
