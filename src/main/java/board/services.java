package board;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class services {

	@FindBy(xpath="(//a[text()='Services'])[2]") private WebElement service;
	
	
	public services(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnService() throws InterruptedException {
		Thread.sleep(1500);
		
		service.click();
	
	}
	
	
	
}
