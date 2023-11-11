package ListenerPack;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Testng_Utilitis.Utilities;

public class Ilisteners extends Utilities implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver=((Utilities)result.getInstance()).driver;
		try {
			screenshort("Success");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver=((Utilities)result.getInstance()).driver;
		try {
			screenshort("Failed");
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

}
