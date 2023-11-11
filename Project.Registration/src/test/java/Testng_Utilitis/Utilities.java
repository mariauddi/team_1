package Testng_Utilitis;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class Utilities {
	public WebDriver driver;
  
  @Parameters({"browser","website"})
  @BeforeClass
 
	  public void ibrowser(String mainofbrowser,String url) {
			String ud = System.getProperty("user.dir");
			if(mainofbrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\GITHUB\\maria'github\\project.selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();}
			
			else if(mainofbrowser.equalsIgnoreCase("edge")){
				System.setProperty("webdriver.edge.driver","C:\\GITHUB\\maria'github\\project.selenium\\Drivers\\chromedriver.exeC:\\GITHUB\\maria'github\\project.selenium\\Drivers\\chromedriver.exeC:\\GITHUB\\maria'github\\project.selenium\\Drivers\\chromedriver.exe");
				driver = new EdgeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.navigate().refresh();
				driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);}}
    
		
  

  @AfterClass
   public void afterclass() throws IOException {
	
	  //driver.close();
	  
  }
		
		 public void screenshort(String Folder) throws IOException  {
		    	String ud = System.getProperty("user.dir");
		    	Date ob = new Date();
		    	System.out.println(ob);
		    	
		    	String dfile = ob.toString().replace(" ","_").replace(":", "_");
		    	System.out.println( dfile);
		    	
		    	File scshort = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	org.openqa.selenium.io.FileHandler.copy(scshort,new File(ud+ "\\Pictures\\"+Folder+"\\"+dfile+"home.jpg"));}
		    	
		
  

}
