package Board;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import board.services;

public class testClass extends baseClass{
	services ser;
	

	@BeforeMethod
	public void StepsToLogin() throws InterruptedException
	{ 
		logInBlackBoard();
		 ser= new services(driver);
		
	}
	
	
	@Test
  public void f() throws InterruptedException {
	  Reporter.log("successfully login ", true);
	  ser.clickOnService();
	  
	  
  }
}
