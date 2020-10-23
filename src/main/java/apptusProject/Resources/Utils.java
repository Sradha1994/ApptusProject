package apptusProject.Resources;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Utils extends base {
	public static WebDriver driver;
	
	public Utils() {
		this.driver=driver;
	}
	
	public static boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  public static String closeAlertAndGetItsText() {
			
	          Alert alert = driver.switchTo().alert();
	          String alertText = alert.getText();
	            alert.accept();
	          return alertText;
			
	      }
}
