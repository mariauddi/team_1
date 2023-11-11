package Registration_Maria;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.JavaScriptUtilities;

public class Registration_Main_Page3 extends JavaScriptUtilities {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='input-firstname']")WebElement first_name;
	@FindBy(xpath = "//*[@id='input-lastname']")WebElement last_name;
	@FindBy(xpath = "//*[@id='input-email']")WebElement email;
	@FindBy(xpath = "//*[@id='input-telephone']")WebElement telephon;
	@FindBy(xpath = "//*[@id='input-password']")WebElement password;
	@FindBy(xpath = "//*[@id='input-confirm']")WebElement cinfirm_pass;
	@FindBy(xpath = "//*[@name='agree']")WebElement privacy_policy;
	@FindBy(xpath = "//*[@type='submit']")WebElement continu;
	
	
     public void fname() {
    	wait_element_clickable(driver,first_name );
    	first_name.sendKeys("mim");
		
	}
	
   public void lname() {
    	last_name.sendKeys("rim");
		
	}
   public void email() {
    	email.sendKeys("rim12@gmail.com");
	
}
   public void telephonenumber() {
	   telephon.sendKeys("7742517936");
	
}
   public void pass() {
	   password.sendKeys("mim123456");
	
}
   public void confirmepass() {
	   cinfirm_pass.sendKeys("mim123456");
	
}
   public void privecypolicy() {
	   privacy_policy.click();
	
}
   public void enter() {
	   continu.click();
}
	
	public Registration_Main_Page3 (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
