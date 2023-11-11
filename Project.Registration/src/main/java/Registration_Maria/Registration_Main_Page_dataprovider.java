package Registration_Maria;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.JavaScriptUtilities;

public class Registration_Main_Page_dataprovider extends JavaScriptUtilities {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='input-firstname']")WebElement first_name;
	@FindBy(xpath = "//*[@id='input-lastname']")WebElement last_name;
	@FindBy(xpath = "//*[@id='input-email']")WebElement Email;
	@FindBy(xpath = "//*[@id='input-telephone']")WebElement telephon;
	@FindBy(xpath = "//*[@id='input-password']")WebElement password_p;
	@FindBy(xpath = "//*[@id='input-confirm']")WebElement cinfirm_pass;
	@FindBy(xpath = "//*[@name='agree']")WebElement privacy_policy;
	@FindBy(xpath = "//*[@type='submit']")WebElement continu;
	
	
	
     public void fname(String firstname) {
    	wait_element_clickable(driver,first_name );
    	first_name.sendKeys(firstname);
		
	}
	
   public void lname(String lastname) {
    	last_name.sendKeys(lastname);
		
	}
   public void email_add(String email) {
    	Email.sendKeys(email);
	
}
   public void telephonenumber(String telenog) {
	   telephon.sendKeys(telenog);
	
}
   public void pass(String password) {
	   password_p.sendKeys( password);
	
}
   public void confirmepass(String cofirmpass) {
	   cinfirm_pass.sendKeys(cofirmpass );
	
}
   public void privecypolicy() {
	   privacy_policy.click();
	
}
   public void enter() {
	   continu.click();
	  
}
   
  public void clear() {
	  first_name.clear();
	  last_name.clear();
	   Email.clear();
	   telephon.clear();
	   password_p.clear();
	   cinfirm_pass.clear();
	   privacy_policy.click();
	  
  }
	
	public Registration_Main_Page_dataprovider (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
