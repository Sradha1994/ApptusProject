package apptusProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FadedShortSleevePage {
WebDriver driver;

	@FindBy(css="p[id='add_to_cart'] button.exclusive")
	private WebElement addToCart;

	@FindBy(css="div[class='layer_cart_product col-xs-12 col-md-6'] h2")
	private WebElement message;
	
	@FindBy(css="div.layer_cart_product_info span#layer_cart_product_title.product-name")
	private WebElement productname;
	
	@FindBy(css="span[id='layer_cart_product_attributes']")
	private WebElement productAttribute;
	
	@FindBy(css="span#layer_cart_product_quantity")
	private WebElement productquantity;
	
	@FindBy(css="span#layer_cart_product_price")
	private WebElement productprice;
	
	@FindBy(css="div.layer_cart_product_info")
	private WebElement productdetails;
	
	public FadedShortSleevePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public void ClickOnAddToCart() {
		addToCart.click();
	}
	
	public String MessageCheck() {
		String s=message.getAttribute("textContent");
		s=s.stripLeading();
		s=s.stripTrailing();
		return s;
	}
	
	public String ProductCheck() {
		String s=productdetails.getAttribute("innerHTML");
		return s;
	}
	
	/*public String ProductNameCheck() {
		return productname.getText();
	}
	
	public String ProductAttributeCheck() {
		return productAttribute.getAttribute("textContent");
	}
	
	public String ProductQuantityCheck() {
		return productquantity.getAttribute("textContent");
	}
	
	public String ProductPriceCheck() {
		return productprice.getAttribute("textContent");
	}*/
	
}
