package Commons;





import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Commons {
	public WebDriver driver;
  
  //@Parameters({"browser","website"})
 
 
    
		
		
		 public void screenshort() throws IOException  {
		    	String ud = System.getProperty("user.dir");
		    	Date ob = new Date();
		    	System.out.println(ob);
		    	
		    	String dfile = ob.toString().replace(" ","_").replace(":", "_");
		    	System.out.println( dfile);
		    	
		    	File scshort = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	org.openqa.selenium.io.FileHandler.copy(scshort,new File(ud+ "\\Pictures\\"+dfile+"home.jpg"));}
		    	
		
  

}
