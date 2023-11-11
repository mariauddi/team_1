package Project_Registration_1_Maria;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Registration_Maria.Registation_Main_page2;
import Registration_Maria.Register_Main_page;
import Registration_Maria.Registration_Main_Page3;
import Registration_Maria.Registration_Main_Page_dataprovider;
import Testng_Utilitis.Utilities;

import org.openqa.selenium.WebDriver;



public class Registration_Page extends Utilities {
	
	
  @Test
  public void Validate_Webpage() {
	  Register_Main_page rmp = new Register_Main_page(driver);
	 
	  
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	  SoftAssert sk = new SoftAssert();
	  sk.assertEquals(url,"https://tutorialsninja.com/demo/index.php?route=account/register","verify the url");
	  sk.assertAll();  }
	  
	
  @Test
  public void Verify_error_message() { 
	  Register_Main_page ob = new Register_Main_page(driver);
	  ob.firstname();
	  ob.lastname();
	  ob.emailaddress();
	  ob.phonenumber();
	  ob.passw();
	  ob.confirmpassword();
	  ob.polisy();
	  ob.enter();
  
  }
  
  @Test
  public void Verify_indication_of_mandatory_fields () { 
	  Registation_Main_page2 ob1 = new Registation_Main_page2(driver);
	  ob1.laveloffirstname();
	  ob1.laveloflastname();
	  ob1.lavelofemail();
	  ob1.lavelofphone();
	  ob1.lavelofpassword();
	  ob1.lavelofconfirmpassword();}
  
  
  
  
  @Test
  public void redirect_to_the_login_page() {
	  Registration_Main_Page3 ob2 = new Registration_Main_Page3(driver);
	  ob2.fname();
	  ob2.lname();
	  ob2.email();
	  ob2.telephonenumber();
	  ob2.pass();
	  ob2.confirmepass();
	  ob2.privecypolicy();
	  ob2.enter();
		  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
 
}
