package Registration_Maria;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.JavaScriptUtilities;

public class Registation_Main_page2 extends JavaScriptUtilities {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@for='input-firstname']")WebElement lavet_FN;
	@FindBy(xpath = "//*[@for='input-lastname']")WebElement lavel_LN;
	@FindBy(xpath = "//*[@for='input-email']")WebElement lavel_Email;
	@FindBy(xpath = "//*[@for='input-telephone']")WebElement lavel_Phone;
	@FindBy(xpath = "//*[@for='input-password']")WebElement lavel_pass;
	@FindBy(xpath = "//*[@for='input-confirm']")WebElement lavel_confirmpass;
	
	
	
	public void laveloffirstname() {
		JavaScriptUtilities.drawborder_black(lavet_FN, driver);
		
	}
	public void laveloflastname() {
		JavaScriptUtilities.drawborder_blue(lavel_LN, driver);
		
	}
	public void lavelofemail() {
		JavaScriptUtilities.drawborder_green(lavel_Email, driver);
		
	}
	public void lavelofphone() {
		JavaScriptUtilities.drawborder_red(lavel_Phone, driver);
		
	}
	public void lavelofpassword() {
		JavaScriptUtilities.drawborder_black(lavel_pass, driver);
		
	}
	public void lavelofconfirmpassword() {
		JavaScriptUtilities.drawborder_red(lavel_confirmpass, driver);
		
	}
	
	public Registation_Main_page2(WebDriver driver) {
		    this.driver = driver;
		    PageFactory.initElements(driver,this);
	}
	
	
}
